package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    
    @RequestMapping("/welcome")
    public String hoemPage(Model model) {
        model.addAttribute("name", "Welcome to Spring MVC");
        model.addAttribute("description", "This is a simple example of Spring MVC");
        return "student/welcome";
    }

}
