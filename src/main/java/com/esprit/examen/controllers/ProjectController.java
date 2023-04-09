package com.esprit.examen.controllers;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class ProjectController {
    @GetMapping
	public List<Produit> getProduits() {
		return produitService.retrieveAllProduits();
	}

    @GetMapping("/{secteurActivite-id}")
	public SecteurActivite retrieveSecteurActivite(@PathVariable("secteurActivite-id") Long secteurActiviteId) {
		return secteurActiviteService.retrieveSecteurActivite(secteurActiviteId);
	}
	
}
