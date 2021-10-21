package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class BySpeciesBrowser implements SpecificBrowser {

    public List<Animal> browse(List<Animal> animals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyszukaj po płci: (tak/nie)");
        String answer = scanner.nextLine();
        if (answer.equals("tak")) {
            System.out.println("Płeć: (male/female)");
            String sex = scanner.nextLine();
            return animals.stream()
                    .filter(a -> a.getSex().equals(sex))
                    .collect(Collectors.toList());
        }
        return animals;
    }
}
