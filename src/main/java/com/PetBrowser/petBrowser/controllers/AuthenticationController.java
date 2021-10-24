package com.PetBrowser.petBrowser.controllers;

import com.PetBrowser.petBrowser.entities.User;
import com.PetBrowser.petBrowser.services.LoginService;
import com.PetBrowser.petBrowser.services.RegisterService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@AllArgsConstructor
@Controller
public class AuthenticationController {

    private RegisterService registerService;
    private LoginService loginService;
    @GetMapping("/authentication-menu")
    public String getAuthenticationMenu(){
        return "authentication-menu";
    }
    @GetMapping("/logging")
    public String getLogging(){
        return "logging";
    }
    @GetMapping("/register")
    public String getRegister(){
        return "register";
    }
    @PostMapping("/register")
    public String registerUser(String email, String password/* spring sam podrzuci mi te paramatery. musi byc zgodnosc z name inputów*/) {
        User user = new User(email,password);
        if (registerService.register(user)) {
            return "add-pet";
        }
        return "false-register";
    }
    @PostMapping("/logging")
    public String logUser(String email, String password) {
        User user = new User(email,password);
        if (loginService.login(user)) {
            return "add-pet";
        }
        return "false-logging";
    }
}
