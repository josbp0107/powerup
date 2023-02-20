package com.example.powerup.domain.spi;

import com.example.powerup.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(String documentId);

    void updateUser(User user);

    void deleteUser(String documentId);
}
