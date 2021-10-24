package com.PetBrowser.petBrowser.repositories;

import com.PetBrowser.petBrowser.entities.Adress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Adress, Long> {
}
