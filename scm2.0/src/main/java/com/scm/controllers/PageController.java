package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name","Samart Contact Manager");
        model.addAttribute("Role","Software Engineer");
        System.out.println("Home page Handler");
        return "Home";
    }
}

