package com.springboot.libraryOrg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{
	//New
	Page<Books> findByTitle(String title, Pageable pageable);
	Page<Books> findByAuthor(String author, Pageable pageable);
	
	//Old
	//List<Books> findByTitle(String title);

}

