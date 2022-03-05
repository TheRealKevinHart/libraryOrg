package com.springboot.libraryOrg.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.libraryOrg.models.Books;
import com.springboot.libraryOrg.services.BooksService;

@Controller
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Books> books = booksService.getAll();
		model.addAttribute("books", books);
		return "books";
	}
}
