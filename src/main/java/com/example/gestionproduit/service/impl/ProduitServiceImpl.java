package com.example.gestionproduit.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.example.gestionproduit.exception.ElementNotFoundException;
import com.example.gestionproduit.mapper.ProduitMapper;
import com.example.gestionproduit.models.dto.ProduitDTO;
import com.example.gestionproduit.repository.ProduitRepository;
import com.example.gestionproduit.service.spec.ProduitService;
// import com.example.gestionproduit.models.entities.Produit;

import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl implements ProduitService{

    private final ProduitRepository repository;
    private final ProduitMapper mapper;

    public ProduitServiceImpl(ProduitRepository repository, ProduitMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ProduitDTO> getAll() {
        
        return repository.findAll()
                  .stream()
                  .map(mapper::toDto)
                  .collect(Collectors.toList());
    }

    @Override
    public ProduitDTO getOne(long id) {
        
        return repository.findById(id)
                         .map(mapper::toDto)
                         .orElseThrow(ElementNotFoundException::new);

        // Produit produit = repository.findById(id)
        //                             .orElseThrow(ElementNotFoundException::new);
        // return mapper.toDto(produit);
    }
    
}
