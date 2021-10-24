package com.PetBrowser.petBrowser.controllers;

import com.PetBrowser.petBrowser.browsers.MainBrowser;
import com.PetBrowser.petBrowser.entities.Animal;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@AllArgsConstructor
@Controller
public class BrowseController {

    private MainBrowser mainBrowser;

    @GetMapping("/browser")
    public String getBrowser(){
        return "browser";
    }

    @PostMapping("/browser")
    public List<Animal> browse(String species, String race, String sex, double youngest, double oldest, String country) {
      return mainBrowser.browse(species, race, sex, oldest, youngest, country);
    }
}
