package com.mauricio.adapterpattern.adapter.route.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mauricio.adapterpattern")
public class AdapterPatternApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdapterPatternApplication.class, args);
	}
}
