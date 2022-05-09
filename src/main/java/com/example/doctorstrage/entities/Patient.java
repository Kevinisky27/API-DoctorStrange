package com.example.doctorstrage.entities;
import lombok.Getter;
import lombok.Setter;

import javax.persistence. *;

@Entity
@Table(name = "patient")

@Getter
@Setter
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Long id;
    @Column(name = "primer_nombre")
    private String name;
    @Column(name = "segundo_nombre")
    private String secondName;
    @Column(name = "primer_apellido")
    private String lastName;
    @Column(name = "segundo_apellido")
    private String secondLastName;
    @Column(name = "edad")
    private Integer old;
}
