package com.example.doctorstrage.dao;

import com.example.doctorstrage.entities.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentDao extends CrudRepository<Appointment, Long> {
}
