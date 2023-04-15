package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    public Reglement addReglement(@RequestBody Reglement r) {
        Reglement reglement = reglementService.addReglement(r);
        return reglement;

	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks() {
		return stockService.retrieveAllStocks();
	}
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
package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
	@PostMapping
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
		CategorieProduit categorieProduit = categorieProduitService.addCategorieProduit(cp);
		return categorieProduit;
	}
}
