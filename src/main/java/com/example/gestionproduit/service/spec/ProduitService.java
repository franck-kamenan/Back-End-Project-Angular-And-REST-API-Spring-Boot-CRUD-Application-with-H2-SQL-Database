package com.example.gestionproduit.service.spec;

import java.util.List;

import com.example.gestionproduit.models.dto.ProduitDTO;

public interface ProduitService {
    
    List<ProduitDTO> getAll();
    ProduitDTO getOne(long id);
}
