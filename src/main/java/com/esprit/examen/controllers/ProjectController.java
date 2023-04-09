package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
    public Reglement addReglement(@RequestBody Reglement r) {
        Reglement reglement = reglementService.addReglement(r);
        return reglement;
	
}
