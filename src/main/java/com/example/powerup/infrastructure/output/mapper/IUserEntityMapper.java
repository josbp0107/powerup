package com.example.powerup.infrastructure.output.mapper;

import com.example.powerup.domain.model.User;
import com.example.powerup.infrastructure.output.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserEntityMapper {

    UserEntity toEntity(User user);

    User toUserModel(UserEntity userEntity);

    List<User> toUserModelList(List<UserEntity> userEntityList);


}
