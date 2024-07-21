package com.example.demo.memeber.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @RequestMapping("/v1/create")
    public String createMember() {
        return "Create Member API";
    }
}
