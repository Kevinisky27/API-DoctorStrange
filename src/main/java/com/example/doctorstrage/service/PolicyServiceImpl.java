package com.example.doctorstrage.service;

import com.example.doctorstrage.dao.PolicyDao;
import com.example.doctorstrage.entities.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService{
    @Autowired
    private PolicyDao policyDao;


    @Override
    public List<Policy> listarPolicy() {
        return (List<Policy>) policyDao.findAll();
    }

    @Override
    public Policy buscarPoliza(Long id) {
        return policyDao.findById(id).orElse(null);
    }

    @Override
    public void modificarPoliza(Long id, Policy policy) {
        if (policyDao.existsById(id)){
            policy.setId(id);
            policyDao.save(policy);
        }
    }

    @Override
    public void eliminarPoliza(Long id) {
        if (policyDao.existsById(id)){
            policyDao.deleteById(id);
        }
    }
}
