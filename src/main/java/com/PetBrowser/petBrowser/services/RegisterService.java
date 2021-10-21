package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.entities.User;
import com.PetBrowser.petBrowser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class RegisterService {
    private final UserRepository userRepository;

    @Autowired
    public RegisterService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    boolean register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zarejestruj się");
        System.out.println("email:");
        String email = scanner.nextLine();
        System.out.println("hasło");
        String password = scanner.nextLine();
        User user = new User(email, password);
        boolean exists = userRepository.exists(Example.of(user));
        if (exists) {
            userRepository.save(user);
            System.out.println("Zarejestrowano");
            return true;
        }
        try {
            throw new UserDoesntExistsException("Taki user nie istnieje");
        } catch (UserDoesntExistsException e) {
            e.printStackTrace();
        }
        return false;
    }
}
