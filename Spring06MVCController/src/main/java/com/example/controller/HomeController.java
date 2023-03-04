package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // This annotation is used to mark a class as a controller
public class HomeController {

    @RequestMapping("/home") // This annotation is used to map a URL to a method
    public String homePage() {
        return "home.html";
    }

    @RequestMapping("/welcome") // This annotation is used to map a URL to a method
    public String welcome() {
        return "welcome.html";
    }

}
