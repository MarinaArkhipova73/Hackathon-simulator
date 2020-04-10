package ru.itis.hackaton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.hackaton.services.UsersService;

@Controller
@RequestMapping("/signIn")
public class SignInController {

    @Autowired
    private UsersService usersService;

    @GetMapping
    public String getSignInPage() {
        return "signIn";
    }

    @PostMapping
    public String login(@RequestParam(name = "userName") String userName) {
        usersService.addUser(userName);
        return "redirect:/start";
    }
}
