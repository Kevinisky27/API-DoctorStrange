package com.example.doctorstrage.service;

import com.example.doctorstrage.entities.Patient;

import java.util.List;

public interface PatientService {
    // Listar Pacientes
    List<Patient> listarPacientes ();

    // Buscar Paciente
    Patient buscarPaciente(Long id);

    // Modificar Paciente
    void ModificarPaciente (Long id, Patient patient);

    //Eliminar Paciente
    void EliminarPaciente (Long id);
}
