package com.PetBrowser.petBrowser.repositories;

import com.PetBrowser.petBrowser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    //  JpaRepository< , > chce wiedziec obiekt jakiej klasy ma zapisac oraz jaki ma typ id
}
