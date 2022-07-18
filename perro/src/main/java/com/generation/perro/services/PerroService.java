package com.generation.perro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.perro.models.Perro;
import com.generation.perro.repositories.PerroRepository;

@Service
public class PerroService {
    @Autowired
    PerroRepository perroRepository;

    public List<Perro> listaPerros() {
        return perroRepository.findAll();
    }

    public void guardarPerro(Perro perro) {

        perroRepository.save(perro);
    }

    public void eliminarPerro(Long id) {

        perroRepository.deleteById(id);
    }
}
