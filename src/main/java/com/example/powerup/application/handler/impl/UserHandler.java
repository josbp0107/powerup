package com.example.powerup.application.handler.impl;

import com.example.powerup.application.dto.request.UserRequestDto;
import com.example.powerup.application.dto.response.UserResponseDto;
import com.example.powerup.application.handler.IUserHandler;
import com.example.powerup.application.mapper.IUserRequestMapper;
import com.example.powerup.application.mapper.IUserResponseMapper;
import com.example.powerup.domain.api.IUserServicePort;
import com.example.powerup.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@RequiredArgsConstructor // Generate construct automatically
@Service
@Transactional
public class UserHandler implements IUserHandler {

    private final IUserServicePort userServicePort;
    private final IUserRequestMapper userRequestMapper;
    private final IUserResponseMapper userResponseMapper;

    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        User user = userRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(user);
    }

    @Override
    public List<UserResponseDto> getAllUsers() {
        return userResponseMapper.toResponseList(userServicePort.getAllUsers());
    }
}
