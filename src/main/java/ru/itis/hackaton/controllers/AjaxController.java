package ru.itis.hackaton.controllers;

import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.hackaton.models.Question;
import ru.itis.hackaton.services.QuestionService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AjaxController {
    private QuestionService questionService;

    @Autowired
    public AjaxController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping(path = "/ajax/answer")
    public ResponseEntity<?> answer(@RequestParam(name = "id") Long id, @RequestParam(name = "answerId") Long answerId,
                                     @RequestParam(name = "coachName") String coachName) {
        questionService.calculate(answerId, coachName);
        id++;
        Question next = questionService.findById(id);
        return ResponseEntity.ok(next);
    }
}
