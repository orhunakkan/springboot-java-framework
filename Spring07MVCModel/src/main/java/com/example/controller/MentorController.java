package com.example.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.Gender;
import com.example.model.Mentor;
import org.springframework.ui.Model;

@Controller
public class MentorController {

    @RequestMapping("/mentor") // localhost:8080/mentor
    public String mentorPage(Model model) {

        List<Mentor> mentors = new ArrayList<>();
        mentors.add(new Mentor("John", "Doe", 45, Gender.MALE));
        mentors.add(new Mentor("Jane", "Doe", 44, Gender.FEMALE));
        mentors.add(new Mentor("Jack", "Doe", 20, Gender.MALE));

        model.addAttribute("mentors", mentors);

        return "mentor/mentor"; // mentor/mentor.html
    }

}
