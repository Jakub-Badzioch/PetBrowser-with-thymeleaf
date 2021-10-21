package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class ByAgeBrowser implements SpecificBrowser {
    public List<Animal> browse(List<Animal> animals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyszukaj po wieku zwierzaka: (tak/nie)");
        String answer = scanner.nextLine();
        if (answer.equals("tak")) {
            System.out.println("Wiek od:");
            double youngest = scanner.nextDouble();
            System.out.println("Wiek do:");
            double oldest = scanner.nextDouble();
            return animals.stream()
                    .filter(a -> a.getAge() >= youngest)
                    .filter(a -> a.getAge() <= oldest)
                    .collect(Collectors.toList());
        }
        return animals;
    }
}
