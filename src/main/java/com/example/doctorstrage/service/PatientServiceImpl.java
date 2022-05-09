package com.example.doctorstrage.service;

import com.example.doctorstrage.dao.PatientDao;
import com.example.doctorstrage.entities.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    private PatientDao patientDao;

    @Override
    public List<Patient> listarPacientes() {
        return (List<Patient>) patientDao.findAll();
    }

    @Override
    public Patient buscarPaciente(Long id) {
        return patientDao.findById(id).orElse(null);
    }

    @Override
    public void ModificarPaciente(Long id, Patient patient) {
        if (patientDao.existsById(id)){
            patient.setId(id);
            patientDao.save(patient);
        }
    }

    @Override
    public void EliminarPaciente(Long id) {
        if (patientDao.existsById(id)){
            patientDao.deleteById(id);
        }
    }
}
