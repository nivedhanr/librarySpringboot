package com.example.library_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @PostMapping("/admin")
    public String Adminlogin(){
        return "welcome to  adminlogin";
    }
    @PostMapping("/userlogin")
    public String Userlogin(){
        return "welcome to userlogin";
    }
    @PostMapping("/userreg")
    public String Userreg(){
        return "Welcome to user registration";
    }
    @PostMapping("/add")
    public String Add(){
        return "add book";

    }
    @PostMapping("/search")
    public String Search(){
        return "Welcome to book search";
    }
    @PostMapping("/edit")
    public String Edit(){
        return "welcome to book edit";
    }
    @PostMapping("/delete")
    public String Delete(){
        return "Welcome to delete book";
    }
}
