package com.springboot.libraryOrg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long>{
	
	@Query(value = "SELECT * FROM books WHERE MATCH(title, author) AGAINST(?1)",
			//+ "MATCH(title, author, year) "
			nativeQuery = true)
	List<Books> search(String keyword);
}

