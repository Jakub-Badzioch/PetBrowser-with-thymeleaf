package com.PetBrowser.petBrowser.services;

public class UserDoesntExistsException extends Exception{
    public UserDoesntExistsException(String message) {
        super(message);
    }
}
