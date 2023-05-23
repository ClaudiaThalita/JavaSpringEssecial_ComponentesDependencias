package com.example.aula.service;

import org.springframework.stereotype.Service;


public class BrazilTaxService extends TaxService{

	@Override
	public double tax(Double amount) {
		return amount * 0.3;
		
	}
}
