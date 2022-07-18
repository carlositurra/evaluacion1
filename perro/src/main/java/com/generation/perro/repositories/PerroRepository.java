package com.generation.perro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.perro.models.Perro;
@Repository
public interface PerroRepository extends JpaRepository<Perro ,Long> {
    
}
