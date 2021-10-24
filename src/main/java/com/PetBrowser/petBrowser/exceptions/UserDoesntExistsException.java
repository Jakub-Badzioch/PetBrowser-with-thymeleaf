package com.PetBrowser.petBrowser.exceptions;

public class UserDoesntExistsException extends Exception{
    public UserDoesntExistsException(String message) {
        super(message);
    }
}
