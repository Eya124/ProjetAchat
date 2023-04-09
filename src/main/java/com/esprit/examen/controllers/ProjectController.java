package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    @GetMapping
	public List<Produit> getProduits() {
		return produitService.retrieveAllProduits();
	}
    
    @GetMapping("/{facture-id}")

    public Facture retrieveFacture(@PathVariable("facture-id") Long factureId) {
        return factureService.retrieveFacture(factureId);
    }

    @GetMapping("/{secteurActivite-id}")
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}
	
}
