package com.example.powerup.domain.api;

import com.example.powerup.domain.model.User;

import java.util.List;

public interface IUserServicePort {

    void saveUser(User user);

    List<User> getAllUsers();

    User getUser(String documentId);

    void updateUser(User user);

    void deleteUser(String documentId);
}
