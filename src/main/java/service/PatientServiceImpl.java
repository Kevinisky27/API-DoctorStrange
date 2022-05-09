package service;

import dao.PatientDao;
import entities.Patient;
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
}
