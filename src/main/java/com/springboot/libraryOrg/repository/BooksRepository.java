package com.springboot.libraryOrg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{
	List<Books> findByTitle(String title);
}

