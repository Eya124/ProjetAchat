package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    
    @GetMapping("/{facture-id}")

    public Facture retrieveFacture(@PathVariable("facture-id") Long factureId) {
        return factureService.retrieveFacture(factureId);
    }
	
}
