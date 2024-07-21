package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/member")
public class Controller {
    @GetMapping("/v1/create")
    public String createMember() {
        return "Create Member API";
    }
}