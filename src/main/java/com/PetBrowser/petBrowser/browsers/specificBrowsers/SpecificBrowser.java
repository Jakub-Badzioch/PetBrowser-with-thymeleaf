package com.PetBrowser.petBrowser.browsers.specificBrowsers;

import com.PetBrowser.petBrowser.entities.Animal;

import java.util.List;

public interface SpecificBrowser {
    List<Animal> browse(List<Animal> animals);
}
