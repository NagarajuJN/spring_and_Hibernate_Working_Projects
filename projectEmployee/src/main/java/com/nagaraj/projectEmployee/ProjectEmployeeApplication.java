package com.nagaraj.projectEmployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectEmployeeApplication.class, args);
	
		System.out.println("spring is connected mysql");
	}

}
