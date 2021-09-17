package com.springbootexample.demoservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String showMessage(){
        return "Hello World from demoservice";
    }
}
