package com.PetBrowser.petBrowser.browsers;

import com.PetBrowser.petBrowser.browsers.specificBrowsers.*;
import com.PetBrowser.petBrowser.entities.Animal;
import com.PetBrowser.petBrowser.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class MainBrowser {
    private final List<Animal> animals;
    private final BySpeciesBrowser bySpeciesBrowser;
    private final ByRaceBrowser byRaceBrowser;
    private final ByAgeBrowser byAgeBrowser;
    private final BySexBrowser bySexBrowser;
    private final ByLocationBrowser byLocationBrowser;

    @Autowired
    public MainBrowser(BySpeciesBrowser bySpeciesBrowser,
                       ByRaceBrowser byRaceBrowser, ByAgeBrowser byAgeBrowser, BySexBrowser bySexBrowser,
                       ByLocationBrowser byLocationBrowser, AnimalRepository animalRepository) {
        this.bySpeciesBrowser = bySpeciesBrowser;
        this.byRaceBrowser = byRaceBrowser;
        this.byAgeBrowser = byAgeBrowser;
        this.bySexBrowser = bySexBrowser;
        this.byLocationBrowser = byLocationBrowser;
        animals = animalRepository.findAll();
    }


    public void browse() {
        System.out.println("Wyszukaj zwierzaka");
        List<Animal> animalsFound = bySpeciesBrowser.browse(animals);
        animalsFound = byRaceBrowser.browse(animalsFound);
        animalsFound = byAgeBrowser.browse(animalsFound);
        animalsFound = bySexBrowser.browse(animalsFound);
        animalsFound = byLocationBrowser.browse(animalsFound);
        for (Animal animal : animalsFound) {
            System.out.println(animal);
        }
    }
}
