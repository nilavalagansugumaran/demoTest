package com.example.demoTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping(path = "/hello", headers = {"Accept=application/json","Content-Type=application/json"})
    public String sayHello(){

        return "Hello";
    }
}
