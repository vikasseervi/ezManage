package com.vikas.mvc.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/logout")
    public String showLogoutPage() {
        return "login";
    }

    @GetMapping("/access-denied")
    public String showAccessDinedPage(){
        return "access-denied";
    }
}
