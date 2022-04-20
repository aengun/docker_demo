package com.example.docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCtl {

    @GetMapping("/")
    public String hello() {
        return "Hello, Docker!!";
    }

}
