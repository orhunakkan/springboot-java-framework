package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootstrap.DataGenerator;

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @RequestMapping("/register")
    public String register(Model model) {
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/register"; 
    }

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        return "student/welcome"; 
    }
}
