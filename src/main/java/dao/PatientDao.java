package dao;

import entities.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends CrudRepository<Patient, Long>{

}
