package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {

    private final ICategorieProduitService categorieProduitService;
	
	@GetMapping
	public List<CategorieProduit> getCategorieProduit() {
		List<CategorieProduit> list = categorieProduitService.retrieveAllCategorieProduits();
		return list;
	}

	@GetMapping("/{categorieProduit-id}")
	public CategorieProduit retrieveCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		return categorieProduitService.retrieveCategorieProduit(categorieProduitId);
	}

	@PostMapping
	public CategorieProduit addCategorieProduit(@RequestBody CategorieProduit cp) {
		CategorieProduit categorieProduit = categorieProduitService.addCategorieProduit(cp);
		return categorieProduit;
	}

    @DeleteMapping("{categorieProduit-id}")
	public void removeCategorieProduit(@PathVariable("categorieProduit-id") Long categorieProduitId) {
		categorieProduitService.deleteCategorieProduit(categorieProduitId);
	}

	@PutMapping
	public CategorieProduit modifyCategorieProduit(@RequestBody CategorieProduit categorieProduit) {
		return categorieProduitService.updateCategorieProduit(categorieProduit);
	}

    public Reglement addReglement(@RequestBody Reglement r) {
        Reglement reglement = reglementService.addReglement(r);
        return reglement;
    }
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
