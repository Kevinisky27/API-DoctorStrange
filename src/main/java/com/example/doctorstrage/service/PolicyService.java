package com.example.doctorstrage.service;

import com.example.doctorstrage.entities.Policy;

import java.util.List;

public interface PolicyService {
    // Listar Poliza
    List<Policy> listarPolicy();

    // Buscar Poliza
    Policy buscarPoliza(Long id);

    // Modificar Poliza
    void modificarPoliza(Long id, Policy policy);

    // Eliminar Poliza
    void eliminarPoliza(Long id);
}
