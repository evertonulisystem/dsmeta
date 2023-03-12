package com.tecnologia.dsmeta.controller.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnologia.dsmeta.controller.services.SaleService;
import com.tecnologia.dsmeta.entities.Sale;

@RestController
@RequestMapping(value="/sales")
public class SaleController {
	
	
	@Autowired
	private SaleService salesService;	
	
	@GetMapping
	public List<Sale> findSales(){
		return salesService.findSales();
	}
	

}
