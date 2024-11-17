package com.recep.DockerApp.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/deneme")
public class AppController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
