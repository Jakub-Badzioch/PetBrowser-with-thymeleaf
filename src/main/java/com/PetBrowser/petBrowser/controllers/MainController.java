package com.PetBrowser.petBrowser.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/") // link na który bede wchodzic przez przeglądarke
    public String getMain(){
        return "index";
    }
}
