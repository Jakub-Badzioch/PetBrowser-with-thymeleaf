package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class BySexBrowser {

    public List<Animal> browse(List<Animal> animals, String sex) {
            return animals.stream()
                    .filter(a -> a.getSex().equals(sex))
                    .collect(Collectors.toList());
    }
}
