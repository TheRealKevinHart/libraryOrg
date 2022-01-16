package com.springboot.libraryOrg;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to our project.";
	}
	
}
