package com.springboot.libraryOrg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.libraryOrg.models.Books;

// This will be AUTO IMPLEMENTED by Spring into a Bean called booksRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface BooksRepository extends CrudRepository<Books, Integer> {

	//keyword search
	@Query(value= "select * from books books where books.title like %:keyword% or books.author like %:keyword%", nativeQuery = true)
	List<Books> findByKeyword(@Param("keyword") String keyword);
}

