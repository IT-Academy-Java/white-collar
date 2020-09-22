package com.itacademy.whitecollar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WhiteCollarController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        // http://localhost:8080/hello?name=Elenita
        return String.format("Hello %s!", name);
    }
}
