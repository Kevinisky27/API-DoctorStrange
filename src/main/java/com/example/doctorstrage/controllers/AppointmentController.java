package com.example.doctorstrage.controllers;

import com.example.doctorstrage.entities.Appointment;
import com.example.doctorstrage.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Appointment> listarCitas(){
        return appointmentService.listarCitas();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Appointment buscarCita(@PathVariable Long id){
        return appointmentService.buscarCita(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearCita(@RequestBody Appointment appointment){
        appointmentService.crearCita(appointment);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modificarCita(@PathVariable Long id, @RequestBody Appointment appointment){
        appointmentService.modificarCita(id, appointment);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void eliminarCita(@PathVariable Long id){
        appointmentService.eliminarCita(id);
    }
}
