package controllers;

import entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PatientService;

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
}
