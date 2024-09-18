package com.jupiter.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping("/")
    public String toIndex(){
        return "hello hi hi hi hinew hello";
    }
}
