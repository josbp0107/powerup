package com.example.powerup.domain.usecase;

import com.example.powerup.domain.api.IRolServicePort;
import com.example.powerup.domain.model.Rol;
import com.example.powerup.domain.spi.IRolPersistencePort;

public class RolUseCase implements IRolServicePort {

    private final IRolPersistencePort rolPersistencePort;

    public RolUseCase(IRolPersistencePort rolPersistencePort) {
        this.rolPersistencePort = rolPersistencePort;
    }

    @Override
    public void saveRol(Rol rol) {
        rolPersistencePort.saveRol(rol);
    }

    @Override
    public void updateRol(Rol rol) {
        rolPersistencePort.updateRol(rol);
    }

    @Override
    public void deleteRol(int id) {
        rolPersistencePort.deleteRol(id);
    }
}
