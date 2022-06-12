package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.ILoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application implements CommandLineRunner{
	private Logger LOG =LoggerFactory.getLogger(Demo2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hola mundo");
	}

}
