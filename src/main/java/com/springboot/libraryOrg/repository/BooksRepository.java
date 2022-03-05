package com.springboot.libraryOrg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called booksRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

}

