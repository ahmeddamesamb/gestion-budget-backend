package com.example.gestion_budget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.gestion_budget")
public class GestionBudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionBudgetApplication.class, args);
		System.out.println("******************** GESTION_BUDGET********************");
	}

}
