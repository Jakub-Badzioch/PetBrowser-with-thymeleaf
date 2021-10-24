package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class ByAgeBrowser {
    public List<Animal> browse(List<Animal> animals, double oldest, double youngest) {
            return animals.stream()
                    .filter(a -> a.getAge() >= youngest)
                    .filter(a -> a.getAge() <= oldest)
                    .collect(Collectors.toList());
    }
}
