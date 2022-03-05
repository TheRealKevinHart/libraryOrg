package com.springboot.libraryOrg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.libraryOrg.models.Books;
import com.springboot.libraryOrg.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksRepository;
	
	public List<Books> getAll() {
		return (List<Books>) booksRepository.findAll();
	}
}
