package com.example.azurecontainerapp.controller; // Adjust this to your project structure

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ACAController {

    @GetMapping("")
    public String getWelcomeText() {
        return "Welcome to Azure Container App Application...";
    }
}