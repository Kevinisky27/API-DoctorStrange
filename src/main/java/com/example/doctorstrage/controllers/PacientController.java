package com.example.doctorstrage.controllers;

import com.example.doctorstrage.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.doctorstrage.service.PatientService;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientController {
    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> listarPacientes (){
        return patientService.listarPacientes();
    }

    @GetMapping ("/{id}")
    public Patient ModificarPacientes (@PathVariable Long id){
        return patientService.buscarPaciente(id);
    }

    @PutMapping("/{id}")
    public void ModificarPacientes (@PathVariable Long id, @RequestBody Patient patient){
        patientService.ModificarPaciente(id, patient);
    }

    @DeleteMapping("/{id}")
    public void EliminarPacientes (@PathVariable Long id){
        patientService.EliminarPaciente(id);
    }
}
