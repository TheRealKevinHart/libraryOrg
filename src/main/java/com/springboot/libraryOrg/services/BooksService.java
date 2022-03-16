package com.springboot.libraryOrg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.libraryOrg.models.Books;
import com.springboot.libraryOrg.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksRepository;

	public List<Books> getAllBooks() {
		return booksRepository.findAll();
	}

	public void saveBooks(Books books) {
		this.booksRepository.save(books);
	}

	public Books getBooksById(long id) {
		Optional<Books> optional = booksRepository.findById(id);
		Books books = null;
		if (optional.isPresent()) {
			books = optional.get();
		} else {
			throw new RuntimeException(" Books not found for id :: " + id);
		}
		return books;
	}

	public void deleteBooksById(long id) {
		this.booksRepository.deleteById(id);
	}

	public Page<Books> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.booksRepository.findAll(pageable);
	}
}
