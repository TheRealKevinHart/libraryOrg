package com.springboot.libraryOrg.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called booksRepository

@Repository
public interface BooksRepository extends PagingAndSortingRepository<Books, Integer> {
	
}

