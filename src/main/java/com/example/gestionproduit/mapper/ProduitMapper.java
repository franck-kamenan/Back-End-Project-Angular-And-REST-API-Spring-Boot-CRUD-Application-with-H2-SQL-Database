package com.example.gestionproduit.mapper;

import com.example.gestionproduit.models.dto.ProduitDTO;
import com.example.gestionproduit.models.entities.Produit;

import org.springframework.stereotype.Service;

@Service
public class ProduitMapper {

    private final MarqueMapper marqueMapper;
    
    public ProduitMapper(MarqueMapper marqueMapper) {

        this.marqueMapper = marqueMapper;
    }

    public ProduitDTO toDto(Produit entity) {

        if (entity == null)            
            return null;

        return ProduitDTO.builder()
                         .id(entity.getId())
                         .nom(entity.getNom())
                         .prix(entity.getPrix())
                         .marque(marqueMapper.toDto(entity.getMarque()))
                         .build();
    }
}
