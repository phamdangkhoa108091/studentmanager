package com.example.studentmanager.controller;

import com.example.studentmanager.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    private final StudentService studentService;

    public PageController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String students(Model model) {
        model.addAttribute("students", studentService.getAll());
        return "students";
    }
}