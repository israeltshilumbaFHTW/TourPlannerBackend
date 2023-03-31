package com.example.demo.service.WeatherService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.web.bind.annotation.RestController
@RequestMapping("/testService")
public class TestService {

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
