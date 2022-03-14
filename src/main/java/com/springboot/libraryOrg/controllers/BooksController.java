package com.springboot.libraryOrg.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.libraryOrg.models.Books;
import com.springboot.libraryOrg.services.BooksService;

@Controller
@RequestMapping("/books")
public class BooksController {
	
	@Autowired
	private BooksService booksService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
//		List<Books> books = booksService.getAll();
//		model.addAttribute("books", books);
//		
//		String username = "Root";
//		model.addAttribute("username", username);
//		
//		return "books";
		
		return findPaginated(1, model);
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Books> getOne(Integer Id) {
		return booksService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Books books) {
		booksService.addNew(books);
		return "redirect:/books/getAll";
	}
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Books books) {
		booksService.update(books);
		return "redirect:/books/getAll";
	}
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer Id) {
		booksService.delete(Id);
		return "redirect:/books/getAll";
	}
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable(value="pageNo") int pageNo, Model model) {
		int pageSize = 5;
		
		Page<Books> page = booksService.findPaginated(pageNo, pageSize);
		List<Books> listBooks = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		model.addAttribute("listBooks", listBooks);
		
		return "books";
	}
}
