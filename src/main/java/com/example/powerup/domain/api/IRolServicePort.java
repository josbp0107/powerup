package com.example.powerup.domain.api;

import com.example.powerup.domain.model.Rol;
import com.example.powerup.domain.model.User;

import java.util.List;

public interface IRolServicePort {

    void saveRol(Rol rol);

    void updateRol(Rol rol);

    void deleteRol(int id);
}
