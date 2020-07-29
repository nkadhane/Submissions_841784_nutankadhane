package com.cognizant.config.configclient;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RequestMapping("/get")
@RestController
public class MessageResource {

    @Value("${message: Default Welcome Client}")
    private String message;

    @GetMapping("/message")
    public String message() {
        return message;
    }
}
