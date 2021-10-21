package com.PetBrowser.petBrowser.services;

import com.PetBrowser.petBrowser.browsers.MainBrowser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.Scanner;

@AllArgsConstructor
@Controller
public class Contoller {
    private RegisterService registerService;
    private LoginService loginService;
    private MainBrowser mainBrowser;

    @PostConstruct// Po stworzeniu tego obiektu odpal się
    void chooseAction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj w aplikacji. Chcesz się zarejestrować, zalogować czy wyszukiwać");
        String answer = scanner.nextLine();

        switch (answer) {
            case "zalogować":
                loginService.login();
                break;
            case "zarejestrować":
                registerService.register();
                break;
            case "wyszukiwać":
                mainBrowser.browse();
                break;
        }
    }
}
