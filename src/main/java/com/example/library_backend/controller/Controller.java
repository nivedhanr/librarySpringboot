package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/admin")
    public String Adminlogin(){
        return "welcome to  adminlogin";
    }
}
