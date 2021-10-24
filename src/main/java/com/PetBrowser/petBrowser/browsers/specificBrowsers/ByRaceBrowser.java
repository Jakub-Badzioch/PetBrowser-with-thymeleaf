package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class ByRaceBrowser {
    public List<Animal> browse(List<Animal> animals, String race) {
            return animals.stream()
                    .filter(a -> a.getRace().equals(race))
                    .collect(Collectors.toList());
    }
}
