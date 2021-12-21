package com.example.gestionproduit.utils;

import com.example.gestionproduit.models.entities.Marque;
import com.example.gestionproduit.models.entities.Produit;
import com.example.gestionproduit.repository.MarqueRepository;
import com.example.gestionproduit.repository.ProduitRepository;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFiller implements InitializingBean{
    
    private final ProduitRepository produitRepository;
    private final MarqueRepository marqueRepository;

    public DatabaseFiller(ProduitRepository produitRepository, MarqueRepository marqueRepository) {

        this.produitRepository = produitRepository;
        this.marqueRepository = marqueRepository;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        
        Marque m1 = new Marque();
        m1.setNom("marque 1");
        m1 = marqueRepository.save(m1);

        Marque m2 = new Marque();
        m2.setNom("marque 2");
        m2 = marqueRepository.save(m2);

        Produit p1 = new Produit();
        p1.setNom("Patate");
        p1.setPrix(0.5);
        p1.setMarque(m1);
        p1 = produitRepository.save(p1);

        Produit p2 = new Produit();
        p2.setNom("Chocolat");
        p2.setPrix(2.8);
        p2.setMarque(m1);
        p2 = produitRepository.save(p2);

        Produit p3 = new Produit();
        p3.setNom("sofa");
        p3.setPrix(200);
        p3.setMarque(m2);
        p3 = produitRepository.save(p3);
    }
}
