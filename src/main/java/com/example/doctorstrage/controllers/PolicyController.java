package com.example.doctorstrage.controllers;

import com.example.doctorstrage.entities.Policy;
import com.example.doctorstrage.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/poliza")
public class PolicyController {
    @Autowired
    private PolicyService policyService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Policy> listarPoliza(){
        return policyService.listarPolicy();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Policy buscarPoliza(@PathVariable Long id){
        return policyService.buscarPoliza(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void modificarPoliza(@PathVariable Long id, @RequestBody Policy policy){
        policyService.modificarPoliza(id, policy);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void eliminarPoliza(@PathVariable Long id){
        policyService.eliminarPoliza(id);
    }
}
