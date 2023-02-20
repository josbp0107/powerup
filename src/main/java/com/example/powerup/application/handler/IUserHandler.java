package com.example.powerup.application.handler;

import com.example.powerup.application.dto.request.UserRequestDto;
import com.example.powerup.application.dto.response.UserResponseDto;

import java.util.List;

public interface IUserHandler {
    void saveUser(UserRequestDto userRequestDto);

    List<UserResponseDto> getAllUsers();
}
