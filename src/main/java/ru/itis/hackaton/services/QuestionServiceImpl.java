package ru.itis.hackaton.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.itis.hackaton.dto.ResultDto;
import ru.itis.hackaton.models.Answer;
import ru.itis.hackaton.models.Coach;
import ru.itis.hackaton.models.Question;
import ru.itis.hackaton.repositories.AnswerRepository;
import ru.itis.hackaton.repositories.QuestionsRepository;
import ru.itis.hackaton.repositories.UsersRepository;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionsRepository questionsRepository;
    private AnswerRepository answerRepository;
    private UsersRepository usersRepository;

    @Autowired
    public QuestionServiceImpl(QuestionsRepository questionsRepository, AnswerRepository answerRepository, UsersRepository usersRepository) {
        this.questionsRepository = questionsRepository;
        this.answerRepository = answerRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public Question findById(Long id) {
        return questionsRepository.findById(id).get();
    }

    @Override
    public List<Question> getAll() {
        return questionsRepository.findAll(Sort.by(Sort.Order.desc("id")));
    }

    @Override
    public void calculate(Long answerId, String coachName) {
        Answer answer = answerRepository.findById(answerId).orElseThrow(IllegalArgumentException::new);
        Coach coach = usersRepository.findByName(coachName).orElseThrow(IllegalArgumentException::new);
        int inspiration = coach.getInspirationPoints();
        int time = coach.getTimePoints();
        int knowledge = coach.getKnowledgePoints();

        coach.setInspirationPoints(inspiration + answer.getInspirationPoints());
        coach.setTimePoints(time + answer.getTimePoints());
        coach.setKnowledgePoints(knowledge + answer.getKnowledgePoints());
        usersRepository.save(coach);
    }

    @Override
    public ResultDto countPoints(Coach coach) {
        String result = "";
        int inspiration = coach.getInspirationPoints();
        int time = coach.getTimePoints();
        int knowledge = coach.getKnowledgePoints();

        if (inspiration >= 25 && time >= 20 && knowledge >= 35) {
            result = "Победа!";
        } else if (inspiration >= 10 && time >= 15 && knowledge >= 25) {
            result = "Спасибо за достойное участие!";
        } else {
            result = "Вы проиграли!";
        }
        return new ResultDto(result, inspiration, time, knowledge);
    }

}
