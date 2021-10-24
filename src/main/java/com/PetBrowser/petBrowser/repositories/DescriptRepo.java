package com.PetBrowser.petBrowser.repositories;

import com.PetBrowser.petBrowser.entities.Description;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DescriptRepo extends JpaRepository<Description, Long> {
}
