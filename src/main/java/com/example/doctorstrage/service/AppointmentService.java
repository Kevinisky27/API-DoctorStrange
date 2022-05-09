package com.example.doctorstrage.service;

import com.example.doctorstrage.entities.Appointment;
import java.util.List;


public interface AppointmentService {

    // Listar Cita
    List<Appointment> listarCitas();

    // Buscar Cita
    Appointment buscarCita(Long id);

    // Crear Cita
    void crearCita(Appointment appointment);

    // Modificar Cita
    void modificarCita (Long id, Appointment appointment);

    // Eliminar Cita
    void eliminarCita (Long id);
}
