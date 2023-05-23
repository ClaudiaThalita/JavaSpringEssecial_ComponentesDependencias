package com.example.aula.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

	public double tax(Double amount) {
		return amount * 0.2;
		
	}
}
