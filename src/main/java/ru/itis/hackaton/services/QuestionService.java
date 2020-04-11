package ru.itis.hackaton.services;

import ru.itis.hackaton.dto.ResultDto;
import ru.itis.hackaton.models.Coach;
import ru.itis.hackaton.models.Question;

import java.util.List;

public interface QuestionService {
    Question findById(Long id);

    List<Question> getAll();

    void calculate(Long answerId, String coachName);

    ResultDto countPoints(Coach coach);
}
