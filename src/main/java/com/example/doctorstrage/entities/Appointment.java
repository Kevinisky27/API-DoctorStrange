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
    @Column(name = "id_cita")
    private Long id;
    @ManyToOne(cascade ={CascadeType.PERSIST})
    @Column(name = "poliza")
    private Policy poliza;
    @Column(name = "fecha")
    private Date date;
    @Column(name = "hora")
    private Time time;
    @Column(name = "estado")
    private String estado;
    @Column(name = "observacion")
    private String observacion;
}
