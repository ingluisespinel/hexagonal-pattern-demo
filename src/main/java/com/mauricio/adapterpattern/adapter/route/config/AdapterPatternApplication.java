package com.mauricio.adapterpattern.adapter.route.config;

import com.mauricio.adapterpattern.adapter.mongo_repository.MongoRepoUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.mauricio.adapterpattern")
// Fix the issue related to 'Field required a bean of type that could not be found.' error spring restful API using mongodb
// See https://stackoverflow.com/questions/42907553/field-required-a-bean-of-type-that-could-not-be-found-error-spring-restful-ap
@EnableMongoRepositories(basePackageClasses = {MongoRepoUser.class})
public class AdapterPatternApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdapterPatternApplication.class, args);
	}
}
