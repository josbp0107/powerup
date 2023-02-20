package com.example.powerup.application.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {
    private String documentoId;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;
}
