package com.tecnologia.dsmeta.controller.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnologia.dsmeta.controller.repositories.SaleRepository;
import com.tecnologia.dsmeta.entities.Sale;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository saleRepository;
	
	public List<Sale> findSales() {
		return saleRepository.findAll();
		
		
	}

}
