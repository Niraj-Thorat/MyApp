package com.example.MyApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${dev.name}")
    private String userName;
    
    @Value("${dev.role}")
    private String userRole;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/userinfo")
    public String getUserInfo(){
        return "Username: " + userName +"; Role:"+ userRole;
    }

}
