package ru.itis.hackaton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.hackaton.models.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
