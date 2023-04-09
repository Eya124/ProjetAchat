package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    @GetMapping
	public List<Produit> getProduits() {
		return produitService.retrieveAllProduits();
	}
    
	
}
