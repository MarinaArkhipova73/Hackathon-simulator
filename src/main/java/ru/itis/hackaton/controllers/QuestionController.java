package ru.itis.hackaton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import ru.itis.hackaton.models.Question;
import ru.itis.hackaton.services.QuestionService;

import javax.servlet.http.HttpSession;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping(path = "/question")
    public String getQuestionPage(ModelMap modelMap, HttpSession session) {
        Question question = questionService.findById(1L);
        modelMap.addAttribute(question);
        modelMap.addAttribute("coachName", session.getAttribute("user"));
        return "question";
    }
}
