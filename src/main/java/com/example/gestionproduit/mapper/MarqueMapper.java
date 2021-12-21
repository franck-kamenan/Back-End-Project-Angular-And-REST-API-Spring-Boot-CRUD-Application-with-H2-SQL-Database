package com.example.gestionproduit.mapper;

import com.example.gestionproduit.models.dto.MarqueDTO;
import com.example.gestionproduit.models.entities.Marque;

import org.springframework.stereotype.Service;

@Service
public class MarqueMapper {
    
    public MarqueDTO toDto(Marque entity) {

        if (entity == null)

            return null;

        return MarqueDTO.builder()
                        .id(entity.getId())
                        .nom(entity.getNom())
                        .build();
        
    }
}
