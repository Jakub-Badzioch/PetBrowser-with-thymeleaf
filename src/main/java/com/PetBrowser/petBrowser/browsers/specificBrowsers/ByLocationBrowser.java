package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ByLocationBrowser{

    public List<Animal> browseByCountry(List<Animal> animals, String country) {
        return animals.stream()
                .filter(a -> a.getAdress().getCountry().equals(country))
                .collect(Collectors.toList());
    }

    public List<Animal> browseByCity(List<Animal> animals, String city) {
        return animals.stream()
                .filter(a -> a.getAdress().getCity().equals(city))
                .collect(Collectors.toList());
    }
}
