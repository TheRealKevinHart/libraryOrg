package com.springboot.libraryOrg.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
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
	
	public Optional<Books> getOne(Integer Id) {
		return booksRepository.findById(Id);		
	}
	
	public void addNew(Books books) {
		booksRepository.save(books);
	}
	
	public void update(Books books) {
		booksRepository.save(books);
	}
	
	public void delete(Integer Id) {
		booksRepository.deleteById(Id);
	}
	
	public Page<Books> findPaginated(int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize);
		return booksRepository.findAll(pageable);
	}
}
