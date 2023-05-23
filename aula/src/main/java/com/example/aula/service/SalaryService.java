package com.example.aula.service;

import org.springframework.stereotype.Service;

import com.example.aula.entities.Employee;

@Service
public class SalaryService {
	
	private TaxService taxService;
	
	private PensionService pensionService;
	
	public SalaryService(TaxService taxservice, PensionService pensionService) {
		this.taxService = taxservice;
		this.pensionService = pensionService;
	}
	
	public double netSalary(Employee employee) {
		return employee.getGrossSalary()- taxService.tax(employee.getGrossSalary())
				- pensionService.discount(employee.getGrossSalary());
				}

}
