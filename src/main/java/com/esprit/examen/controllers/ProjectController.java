package com.esprit.examen.controllers;

import java.util.List;


@RestController

public class ProjectController {
	@GetMapping("/retrieve-all-stocks")
	public List<Stock> getStocks() {
		return stockService.retrieveAllStocks();
	}
}
