package com.vikas.mvc.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "employees/login";
    }

    @GetMapping("/access-denied")
    public String showAccessDinedPage(){
        return "employees/access-denied";
    }
}