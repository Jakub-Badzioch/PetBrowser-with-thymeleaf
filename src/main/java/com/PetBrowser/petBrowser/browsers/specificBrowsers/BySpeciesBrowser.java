package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BySpeciesBrowser {

    public List<Animal> browse(List<Animal> animals, String species) {
            return animals.stream()
                    .filter(a -> a.getSpecies().equals(species))
                    .collect(Collectors.toList());
    }
}
