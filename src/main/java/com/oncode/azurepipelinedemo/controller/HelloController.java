package com.oncode.azurepipelinedemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${welcome.string}")
    private String welcomeMessage;

    @RequestMapping("/")
    public String index() {
        return welcomeMessage;
    }
}
