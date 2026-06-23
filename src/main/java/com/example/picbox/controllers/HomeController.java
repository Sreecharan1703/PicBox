package com.example.picbox.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @RequestMapping("/")
    public String HomePage() {
        return "home";
    }

    @RequestMapping("/main")
    public String MainPage() {
        return "main";
    }

    @GetMapping("/search")
    public String SearchFiles() {
        return "searchpage";
    }
}