package com.example.demo.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/testService")
public class HelloWorldController {

    @GetMapping("/hello")
    public String greet() {
        return "Hello World\n";
    }

    @GetMapping("/helloJson")
    public GreetingJsonResponse greetJson() {
        return new GreetingJsonResponse("Hello World");
    }
    record GreetingJsonResponse(String greetings){}
}
