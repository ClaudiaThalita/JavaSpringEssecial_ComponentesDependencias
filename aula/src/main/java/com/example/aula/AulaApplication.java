package com.example.aula;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aula.entities.Employee;
import com.example.aula.service.BrazilTaxService;
import com.example.aula.service.PensionService;
import com.example.aula.service.SalaryService;
import com.example.aula.service.TaxService;


@SpringBootApplication
public class AulaApplication implements CommandLineRunner{

	
	@Autowired
	private SalaryService salaryService;	
	

	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//
//		
//		System.out.print("Nome: ");
//		String name = sc.nextLine();
//		System.out.print("Salario bruto: ");
//		double grossSalary = sc.nextDouble();
//		
//		Employee employee = new Employee(name,grossSalary);
//		TaxService taxService = new BrazilTaxService();
//		PensionService pensionService = new PensionService();
//		
//		SalaryService salaryService = new SalaryService(taxService,pensionService );
//		
//		double netSalary = salaryService.netSalary(employee);
//		System.out.printf("Salario liquido = %.2f%n", netSalary);
//		sc.close();
		SpringApplication.run(AulaApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("claudia",5000.0);
		System.out.println(salaryService.netSalary(employee));
		
	}

}
