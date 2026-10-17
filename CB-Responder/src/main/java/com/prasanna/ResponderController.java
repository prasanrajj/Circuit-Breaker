package com.prasanna;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponderController {

    @GetMapping("/response")
    public String getResponse() {
        return "Hello from Responder! Request successful.";
    }
}