package com.PetBrowser.petBrowser.repositories;

import com.PetBrowser.petBrowser.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
    //  JpaRepository< , > chce wiedziec obiekt jakiej klasy ma zapisac oraz jaki ma typ id
}
