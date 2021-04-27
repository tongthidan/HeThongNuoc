package com.example.demo;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.example.Entity")
@ComponentScan("com.example.Controller")
//@EnableJpaRepositories("com.example.Controller")
//@ComponentScan("Controller")
//@EnableJpaRepositories("Controller")

public class HethongnuocApplication {

	public static void main(String[] args) {
		SpringApplication.run(HethongnuocApplication.class, args);
	}

}
