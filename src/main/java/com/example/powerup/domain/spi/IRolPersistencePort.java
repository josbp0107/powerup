package com.example.powerup.domain.spi;

import com.example.powerup.domain.model.Rol;

public interface IRolPersistencePort {
    void saveRol(Rol rol);

    void updateRol(Rol rol);

    void deleteRol(int id);
}
