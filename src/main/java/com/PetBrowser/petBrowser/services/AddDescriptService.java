package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.entities.Description;
import com.PetBrowser.petBrowser.repositories.DescriptRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddDescriptService {
    DescriptRepo descriptRepo;

    public boolean addDescript(Description description){
        descriptRepo.save(description);
        return true;
    }
}
