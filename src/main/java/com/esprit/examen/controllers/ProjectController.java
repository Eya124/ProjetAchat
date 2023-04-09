package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    public Reglement addReglement(@RequestBody Reglement r) {
        Reglement reglement = reglementService.addReglement(r);
        return reglement;

    @GetMapping
	public List<Produit> getProduits() {
		return produitService.retrieveAllProduits();
	}

    @GetMapping("/{secteurActivite-id}")
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}

	
}
