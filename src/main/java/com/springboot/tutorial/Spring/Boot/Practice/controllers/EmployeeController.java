package com.springboot.tutorial.Spring.Boot.Practice.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(path = "/getSecret")
    public String getSecret() {
        return "This is the secret";
    }
}
