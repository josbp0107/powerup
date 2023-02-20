package com.example.powerup.infrastructure.output.repository;

import com.example.powerup.infrastructure.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {



}
