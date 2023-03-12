package com.example.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.mentor;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/register")
    public String showForm1(Model model) {
        model.addAttribute("mentor", new mentor());
        List<String> batchList = Arrays.asList("JD1", "JD2", "JD3", "JD4", "JD5");
        model.addAttribute("batchList", batchList);
        return "mentor/mentor-register";
    }

    @PostMapping("/confirm")
    public String showForm2(@ModelAttribute("mentor") com.example.model.mentor mentor, Model model) {

        System.out.println(mentor.toString());
        
        // return "mentor/mentor-confirmation";
        return "redirect:/mentor/register";
    }

}
