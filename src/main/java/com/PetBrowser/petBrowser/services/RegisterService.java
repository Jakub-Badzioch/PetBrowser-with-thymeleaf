package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.entities.User;
import com.PetBrowser.petBrowser.exceptions.UserAlreadyExistException;
import com.PetBrowser.petBrowser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
    private final UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public boolean register(User user) {
        boolean exists = userRepository.exists(Example.of(user));
        if (!exists) {
            userRepository.save(user);
            return true;
        }
        try {
            throw new UserAlreadyExistException("Taki user już istnieje");
        } catch (UserAlreadyExistException e) {
            e.printStackTrace();
        }
        return false;
    }
}
