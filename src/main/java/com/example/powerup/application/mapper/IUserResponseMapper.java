package com.example.powerup.application.mapper;

import com.example.powerup.application.dto.response.UserResponseDto;
import com.example.powerup.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {
    UserResponseDto toResponse(User user);

    List<UserResponseDto> toResponseList(List<User> userModelList);
}
