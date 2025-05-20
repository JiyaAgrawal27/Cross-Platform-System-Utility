package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

       @GetMapping("/greet")
    public String greetUser(@RequestParam(defaultValue = "User") String name) {
        return "Hello, " + name + "! Welcome to the Utility Dashboard.";
    }
}

