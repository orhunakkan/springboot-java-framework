package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootstrap.DataGenerator;
import com.example.model.Employee;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String showEmployeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());
        return "employee/employee-form";
    }

    @PostMapping("/list")
    public String showEmployeeList(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult,
            Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("states", DataGenerator.getAllStates());
            return "employee/employee-form";
        }
        DataGenerator.saveEmployee(employee);
        model.addAttribute("employees", DataGenerator.readAllEmployees());
        return "employee/employee-list";
    }

}
