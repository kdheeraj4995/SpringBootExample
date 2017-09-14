package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.example")
public class SpringBootEx {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootEx.class, args);
	}

}
