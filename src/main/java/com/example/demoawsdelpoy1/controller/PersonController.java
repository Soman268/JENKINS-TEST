package com.example.demoawsdelpoy1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping
    public String getName() {
        return "This is Soman";
    }
}
