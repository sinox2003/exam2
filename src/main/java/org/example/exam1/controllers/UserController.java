package org.example.exam1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class UserController {

    @GetMapping("/login")
    public String showLoginForm() {

        return "login"; // Returns the login.html Thymeleaf template
    }

//    @PostMapping("/login")
//    public String login() {
//        return "home"; // Returns the login.html Thymeleaf template
//    }
//
//    @GetMapping("/home")
//    public String showHomePage() {
//        return "home"; // Returns the home.html Thymeleaf template
//    }
}
