package com.ninja;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ninja.service", "com.ninja.controller"})
public class ApiNinjasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiNinjasApplication.class, args);
	}

}
