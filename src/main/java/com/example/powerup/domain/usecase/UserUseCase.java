package com.example.powerup.domain.usecase;

import com.example.powerup.domain.api.IUserServicePort;
import com.example.powerup.domain.model.User;
import com.example.powerup.domain.spi.IUserPersistencePort;

import java.util.List;

public class UserUseCase implements IUserServicePort {

    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(User user) {
       userPersistencePort.saveUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public User getUser(String documentId) {
        return userPersistencePort.getUser(documentId);
    }

    @Override
    public void updateUser(User user) {
        userPersistencePort.updateUser(user);
    }

    @Override
    public void deleteUser(String documentId) {
        userPersistencePort.deleteUser(documentId);
    }
}
