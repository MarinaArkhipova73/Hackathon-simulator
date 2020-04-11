package ru.itis.hackaton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.hackaton.models.Coach;
import ru.itis.hackaton.models.Question;
import ru.itis.hackaton.services.QuestionService;
import ru.itis.hackaton.services.UsersService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(path = "/question")
public class QuestionController {

    private QuestionService questionService;
    private UsersService usersService;

    @Autowired
    public QuestionController(QuestionService questionService, UsersService usersService) {
        this.questionService = questionService;
        this.usersService = usersService;
    }

    @GetMapping
    public String getQuestionPage(ModelMap modelMap, HttpSession session) {
        Question question = questionService.findById(1L);
        session.setAttribute("question", question);
        modelMap.addAttribute(question);
        modelMap.addAttribute("coachName", session.getAttribute("user"));
        return "question";
    }

    @PostMapping
    public String answer(ModelMap modelMap, HttpSession session, @RequestParam(name = "answer") Long answerId) {
        String coachName = (String) session.getAttribute("user");
        Question question = (Question) session.getAttribute("question");
        questionService.calculate(answerId, coachName);
        Long id = question.getId();
        id++;
        Coach coach = usersService.findByName(coachName);
        if (id == 6) {
            session.setAttribute("result", questionService.countPoints(coach));
            return "redirect:/result";
        }
        Question next = questionService.findById(id);
        session.setAttribute("question", next);
        modelMap.addAttribute(next);
        return "question";
    }
}
