package com.prasanna;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ReceiverService {

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = "receiverCB", fallbackMethod = "receiverFallback")
    public String callReceiver() {
        return restTemplate.getForObject(
                "http://localhost:8082/response",
                String.class
        );
    }

    public String receiverFallback(Throwable t) {
        return "Fallback: CB-Receiver is temporarily unavailable.";
    }
}