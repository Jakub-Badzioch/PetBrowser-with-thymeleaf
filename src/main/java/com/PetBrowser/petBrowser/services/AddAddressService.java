package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.entities.Adress;
import com.PetBrowser.petBrowser.repositories.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class AddAddressService {
    AddressRepository addressRepository;

    public boolean addAdres(Adress adress){
        addressRepository.save(adress);
        return true;
    }

}
