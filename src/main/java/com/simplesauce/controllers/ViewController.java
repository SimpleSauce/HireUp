package com.simplesauce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/about")
    public String siteAbout() {
        return "nav/about";
    }

    @GetMapping("/")
    public String siteIndex() {
        return "nav/index";
    }

    @GetMapping("/results")
    public String siteResults() {
        return "nav/results";
    }

    @GetMapping("/login")
    public String siteLogin() {
        return "user/login";
    }

    @GetMapping("/register")
    public String siteRegister() {
        return "user/register";
    }

    @GetMapping("/profile")
    public String siteProfile() {
        return "user/profile";
    }

}
