package ru.itis.hackaton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.hackaton.models.Question;

@Repository
public interface QuestionsRepository extends JpaRepository<Question,Long> {
}
