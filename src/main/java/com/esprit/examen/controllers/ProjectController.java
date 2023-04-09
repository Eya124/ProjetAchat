package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
<<<<<<< HEAD
    public Reglement addReglement(@RequestBody Reglement r) {
        Reglement reglement = reglementService.addReglement(r);
        return reglement;

=======
	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks() {
		return stockService.retrieveAllStocks();
	}
>>>>>>> 5e86c9e8992daf8a88efaf41207ad6c3a79dedf7
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
