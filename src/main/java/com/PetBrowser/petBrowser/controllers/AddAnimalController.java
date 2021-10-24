package com.PetBrowser.petBrowser.controllers;

import com.PetBrowser.petBrowser.entities.Adress;
import com.PetBrowser.petBrowser.entities.Animal;
import com.PetBrowser.petBrowser.entities.Description;
import com.PetBrowser.petBrowser.services.AddAddressService;
import com.PetBrowser.petBrowser.services.AddAnimalService;
import com.PetBrowser.petBrowser.services.AddDescriptService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class AddAnimalController {
    private AddAnimalService addAnimalService;
    private AddAddressService addAddressService;
    private AddDescriptService addDescriptService;
    // niepowinnismy uzywac repozzytoriumn w kontrolerach poniewaz pomiedzy powinna byc warstwa logiki
    @GetMapping("/add-pet")
    public String getAddPet(){
        return "add-pet";
    }

    @PostMapping("/addPet")
    public String addPet(String species, String race, String name, double age, String sex, String address,
                         String description) { // todo przerobić na dodawanie całego animala

        Adress adress = new Adress(address, "", "", "");
        Description description1 =  new Description(description);
        Animal animal = new Animal(species, race, name, age, sex, adress, description1);

        if ( addDescriptService.addDescript(description1) & addAddressService.addAdres(adress) &
                addAnimalService.addAnimal(animal)) {
            return "add-pet";
        }
        return "false-logging";
    }
}
