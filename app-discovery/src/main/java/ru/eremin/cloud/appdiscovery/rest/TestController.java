package ru.eremin.cloud.appdiscovery.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${developer.email}")
    private String email;

    @RequestMapping("/test")
    public String test(){
        return "email " + email;
    }
}
