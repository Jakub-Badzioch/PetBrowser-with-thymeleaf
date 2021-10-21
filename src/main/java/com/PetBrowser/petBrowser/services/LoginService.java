package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.repositories.UserRepository;
import com.PetBrowser.petBrowser.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


import java.util.Scanner;

@Service
public class LoginService {
    private final UserRepository userRepository;

    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zaloguj się");
        System.out.println("email:");
        String email = scanner.nextLine();
        System.out.println("hasło");
        String password = scanner.nextLine();
        User user = new User(email, password);
        boolean exists = userRepository.exists(Example.of(user));
        if (exists) {
            System.out.println("Zalogowano");
            return;
        }
        try {
            throw new UserAlreadyExistException("Podany user nie istnieje");
        } catch (UserAlreadyExistException e) {
            e.printStackTrace();
        }
    }
}

