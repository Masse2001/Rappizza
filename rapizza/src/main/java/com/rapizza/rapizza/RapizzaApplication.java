package com.rapizza.rapizza;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RapizzaApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(RapizzaApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!");
	}
}
