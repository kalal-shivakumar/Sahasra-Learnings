package com.ram09.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Welcome to My Java Website");
        model.addAttribute("message", "Built with Spring Boot & Thymeleaf");
        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us");
        return "about";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("title", "Contact Us");
        return "contact";
    }
}
