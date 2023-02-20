package com.example.powerup.infrastructure.output.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column()
    private Long documentoId;

    @Column(length = 40)
    private String nombre;

    @Column(length = 40)
    private String apellido;

    @Column(length = 13)
    private String celular;

    @Column(length = 30)
    private String correo;

    @Column(length = 100)
    private String clave;

    @Column()
    private int idRol;

}
