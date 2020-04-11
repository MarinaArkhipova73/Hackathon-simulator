package ru.itis.hackaton.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.hackaton.models.Coach;
import ru.itis.hackaton.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void addUser(String userName) {
        Coach coach = Coach.builder()
                .name(userName)
                .inspirationPoints(10)
                .knowledgePoints(20)
                .timePoints(30)
                .build();
        usersRepository.save(coach);
    }

    @Override
    public Coach findByName(String name) {
        return usersRepository.findByName(name).orElseThrow(IllegalArgumentException::new);
    }
}
