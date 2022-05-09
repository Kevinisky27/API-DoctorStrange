package com.example.doctorstrage.service;

import com.example.doctorstrage.dao.AppointmentDao;
import com.example.doctorstrage.entities.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppoinmentServiceImpl implements AppointmentService{
    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public List<Appointment> listarCitas() {
        return (List<Appointment>) appointmentDao.findAll();
    }

    @Override
    public Appointment buscarCita(Long id) {
        return appointmentDao.findById(id).orElse(null);
    }

    @Override
    public void crearCita(Appointment appointment) {
        appointment.setEstado("Pendiente");
        appointmentDao.save(appointment);
    }

    @Override
    public void modificarCita(Long id, Appointment appointment) {
        if (appointmentDao.existsById(id)) {
            appointment.setId(id);
            appointmentDao.save(appointment);
        }
    }

    @Override
    public void eliminarCita(Long id) {
        if (appointmentDao.existsById(id)) {
            appointmentDao.deleteById(id);
        }
    }
}
