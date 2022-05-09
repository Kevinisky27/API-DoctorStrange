package com.example.doctorstrage.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "appointment")
@Getter @Setter
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cita")
    private Long id;
    @ManyToOne(cascade ={CascadeType.PERSIST})
    @JoinColumn(name = "id_poliza")
    private Policy poliza;
    @Column(name = "fecha_cita")
    private Date date;
    @Column(name = "hora_cita")
    private Time time;
    @Column(name = "estado_cita")
    private String estado;
    @Column(name = "observacion_cita")
    private String observacion;
}
