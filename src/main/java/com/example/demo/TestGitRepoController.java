package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestGitRepoController {
	
	@GetMapping("/first")
	public String getFirst() {
		return "First returned";
	}	
	
	@GetMapping("/second")
	public String getSecond() {
		return "Second returned";
	}
}
