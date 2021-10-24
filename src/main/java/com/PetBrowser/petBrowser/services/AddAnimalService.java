package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.entities.Animal;
import com.PetBrowser.petBrowser.repositories.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddAnimalService {

    private AnimalRepository animalRepository;
    public boolean addAnimal(Animal animal){
        animalRepository.save(animal);
        return true;
    }
}
