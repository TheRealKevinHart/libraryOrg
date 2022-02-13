package com.springboot.libraryOrg;

import org.springframework.data.repository.CrudRepository;

import com.springboot.libraryOrg.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called booksRepository
// CRUD refers Create, Read, Update, Delete

public interface BooksRepository extends CrudRepository<Books, Integer> {

}

