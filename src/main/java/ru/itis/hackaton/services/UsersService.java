package ru.itis.hackaton.services;

import ru.itis.hackaton.models.Coach;

public interface UsersService {
    void addUser(String userName);

    Coach findByName(String name);
}
