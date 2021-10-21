package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Component
public class ByLocationBrowser implements SpecificBrowser{
   public List<Animal> browse(List<Animal> animals) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wyszukaj po mieście lub po państwie: (tak/nie)");
        String answer = scanner.nextLine();
        if (answer.equals("tak")){
            System.out.println("Wybierz: (country/city)");
            answer = scanner.nextLine();
            if (answer.equals("country")){
                return browseByCountry(animals, answer);
            } else if (answer.equals("city")){
                return browseByCity(animals, answer);
            }
        }
        return animals;
    }

    private static List<Animal> browseByCountry(List<Animal> animals, String country) {
        return animals.stream()
                .filter(a -> a.getAdress().getCountry().equals(country))
                .collect(Collectors.toList());
    }

    private static List<Animal> browseByCity(List<Animal> animals, String city) {
        return animals.stream()
                .filter(a -> a.getAdress().getCity().equals(city))
                .collect(Collectors.toList());
    }
}
