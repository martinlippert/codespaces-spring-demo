package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping(value="/greeting")
    public String sayHello() {
        return "Hello World of JCON ONLINE";
    }
}
