package ru.itis.hackaton.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.hackaton.models.Coach;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Coach,Long> {
    Optional<Coach> findByName(String name);
}
