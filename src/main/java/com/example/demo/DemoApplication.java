package com.example.demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner(DemoProperties properties) {
		return (args) -> {
			System.out.println("Demo properties:");
			System.out.println("\t* name -> " + properties.getName());
			System.out.println("\t* counter -> " + properties.getCounter());
		};
	}

}
