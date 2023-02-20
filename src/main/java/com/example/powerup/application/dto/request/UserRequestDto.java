package com.example.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private String documentoId;
    private String nombre;
    private String apellido;
    private String celular;
    private String correo;
    private String clave;
}
