package com.springboot.libraryOrg.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity // This tells Hibernate to make a table out of this class
@Table(name = "books")
public class Books {
	
	@Id //Specifies the primary key of an entity
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="author")
	private String author;
	
	@Column(name="year")
	private Integer year;
	
	@Column(name="genre")
	private String genre;

	@Autowired
	public Books() {
		
	}
	
  	public Books(Integer id, String title, String author, Integer year, String genre) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.year = year;
		this.genre = genre;
	}

	public long getId() {
	  return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
	  	this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + ", year=" + year + ", genre=" + genre
				+ "]";
	}
}

