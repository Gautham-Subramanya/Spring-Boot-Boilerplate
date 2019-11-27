package com.dravid.springbootboilerplatesampleservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    Environment environment;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from: " + environment.getProperty("server.port");
    }
}
