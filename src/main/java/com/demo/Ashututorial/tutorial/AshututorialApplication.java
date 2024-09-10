package com.demo.Ashututorial.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class AshututorialApplication implements CommandLineRunner {
	@Autowired
	DB db;
	public static void main(String[] args) {
		SpringApplication.run(AshututorialApplication.class, args);}
	@Override
	public void run(String... args) throws Exception {

		System.out.println(db.getData());
	}
}
