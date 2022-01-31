package com.springboot.libraryOrg;

import org.springframework.web.bind.annotation.*;

@RestController
public class StringsController {

	@GetMapping("/strings")
	public String[] strings() {
		String[] arr = {"List", "Yes", "Work"};
		return arr;
	}
}
