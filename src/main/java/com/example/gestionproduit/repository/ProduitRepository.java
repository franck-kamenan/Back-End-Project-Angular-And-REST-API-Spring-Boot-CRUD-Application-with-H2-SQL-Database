package com.example.gestionproduit.repository;

import com.example.gestionproduit.models.entities.Produit;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {}
