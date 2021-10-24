package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.exceptions.UserDoesntExistsException;
import com.PetBrowser.petBrowser.repositories.UserRepository;
import com.PetBrowser.petBrowser.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;


@Service
public class LoginService {
    private final UserRepository userRepository;
    // todo do poprawy poniewaz moze byc tylko jeden zalogowany uzytkownik naraz
    // rozwiązaniem jest wykorzystywanie danych w bierzącej sesji
    // mozna zastosować i skonfigurować springsecurity ktory będzie automatycznie wykorzystywać sesje do logowania
    private User loggedUser = null;
    @Autowired
    public LoginService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean login(User user) {
        boolean exists = userRepository.exists(Example.of(user));
        if (exists) {
            loggedUser = user;
            return true;
        }
        try {
            throw new UserDoesntExistsException("Podany user nie istnieje");
        } catch (UserDoesntExistsException e) {
            e.printStackTrace();
        }
        return false;
    }

    public User getLoggedUser() {
        return loggedUser;
    }
}

