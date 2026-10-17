package com.prasanna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenderController {

    private final ReceiverService receiverService;

    public SenderController(ReceiverService receiverService) {
        this.receiverService = receiverService;
    }

    @GetMapping("/send")
    public String sendRequest() {
        return receiverService.callReceiver();
    }
}
