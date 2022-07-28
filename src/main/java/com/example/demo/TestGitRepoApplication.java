package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestGitRepoApplication {

	public static void main(String[] args) {
		System.out.println("Application starting...");
		SpringApplication.run(TestGitRepoApplication.class, args);
		System.out.println("Application has been started");
		System.out.println("Application finally has been started");
	}

}
