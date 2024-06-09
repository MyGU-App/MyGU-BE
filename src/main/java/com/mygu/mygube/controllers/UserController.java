package com.mygu.mygube.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/get-user")
    public String getUserName() {
        return "HELLO WORLD";
    }
}
