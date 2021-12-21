package com.example.gestionproduit.repository;

import com.example.gestionproduit.models.entities.Marque;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Long>{
    
}
