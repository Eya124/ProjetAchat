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
