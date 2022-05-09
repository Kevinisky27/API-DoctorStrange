package com.example.doctorstrage.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@ToString
@Table(name = "poliza")
@Getter @Setter
public class Policy {

    @Id
    private Long id;
    @ManyToOne(cascade ={CascadeType.PERSIST})
    @JoinColumn(name = "id_cliente")
    private Patient paciente;
    @Column(name = "estado_poliza")
    private String estado;
    @Column(name = "inicio_poliza")
    private Date fechaInicio;
    @Column(name = "fin_poliza")
    private Date fechaFin;

}
