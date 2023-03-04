package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Student;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model) {

        model.addAttribute("name", "Welcome to Spring MVC");
        model.addAttribute("description", "This is a simple example of Spring MVC");

        String subject = "Collections";
        model.addAttribute("subject", subject);

        // create some random student ID and show it in the UI
        int studentId = (int) (Math.random() * 1000);
        model.addAttribute("studentId", studentId);

        List<Integer> studentIds = new ArrayList<>();
        studentIds.add(1);
        studentIds.add(2);
        studentIds.add(3);
        studentIds.add(4);
        studentIds.add(5);
        model.addAttribute("studentIds", studentIds);

        Student student = new Student(1, "John", "Doe");
        model.addAttribute("student", student);

        return "student/welcome";
    }

}
