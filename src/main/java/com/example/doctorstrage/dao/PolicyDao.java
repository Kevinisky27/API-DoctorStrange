package com.example.doctorstrage.dao;

import com.example.doctorstrage.entities.Policy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyDao extends CrudRepository<Policy, Long> {
}
