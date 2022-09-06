package com.dailycodebuffer.client.controller;

import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(Principal principal) {
        return "Hello " + principal.getName() + " Welcome to Daily Code Buffer";
    }
}
