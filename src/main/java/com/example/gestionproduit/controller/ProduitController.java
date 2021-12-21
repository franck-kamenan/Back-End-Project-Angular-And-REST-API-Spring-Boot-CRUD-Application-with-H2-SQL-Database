package com.example.gestionproduit.controller;

import java.util.List;

import com.example.gestionproduit.models.dto.ProduitDTO;
import com.example.gestionproduit.service.spec.ProduitService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/produit")
public class ProduitController {
    
    private final ProduitService service;

    public ProduitController(ProduitService service) {

        this.service = service;
    }

    // @GetMapping
    // public List<ProduitDTO> getAll() {
        
    //     return service.getAll();
    // }

    // GET - http://localhost:8080/produit/response
    @GetMapping("/response")
    @ResponseStatus(HttpStatus.OK)
    // @ResponseStatus(HttpStatus.ACCEPTED)
    public List<ProduitDTO> getAllWithResponseEntity() {
        
        return service.getAll();
        
        // return ResponseEntity.status(HttpStatus.OK)
        //                      .header("mon header", "sa valeur")
        //                      .body(service.getAll());
        
        // return ResponseEntity.status(201)
        //                      .header("mon header", "sa valeur")
        //                      .body(service.getAll());
    }
    
    // GET - http://localhost:8080/produit
    @GetMapping
    public ResponseEntity<List<ProduitDTO>> getAll() {
        
        return ResponseEntity.ok(service.getAll());
        
        // return ResponseEntity.status(HttpStatus.OK)
        //                      .header("mon header", "sa valeur")
        //                      .body(service.getAll());
        
        // return ResponseEntity.status(201)
        //                      .header("mon header", "sa valeur")
        //                      .body(service.getAll());
    }
    
    // GET - http://localhost:8080/produit  ?id=x
    @GetMapping(params = {"id"})
    // public ResponseEntity<ProduitDTO> getOne(@RequestParam("id") long identifiant){
    public ResponseEntity<ProduitDTO> getOne(@RequestParam long id){
            
        return ResponseEntity.ok(service.getOne(id));
    }
            
    // @GetMapping(params = {"id", "name"})
    // public String getOne(@RequestParam long id, @RequestParam String name){
                
    //     return "ok";
    // }
                
    // GET - http://localhost:8080/produit/{id}
    @GetMapping("/{id}")
    // public ResponseEntity<ProduitDTO> getOnePath(@PathVariable("id") long identifiant){
    public ResponseEntity<ProduitDTO> getOnePath(@PathVariable long id){

        return ResponseEntity.ok(service.getOne(id));
    }
}
