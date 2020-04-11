package ru.itis.hackaton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.hackaton.services.UsersService;

import javax.servlet.http.HttpSession;

@Controller
public class SignInController {

    @Autowired
    private UsersService usersService;

    @GetMapping(path = "/signIn")
    public String getSignInPage() {
        return "signin";
    }

    @PostMapping(path = "/signIn")
    public String signIn(@RequestParam(name = "username") String userName, HttpSession session) {
        session.setAttribute("user", userName);
        usersService.addUser(userName);
        return "redirect:/question";
    }
}
