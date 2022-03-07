package com.springboot.libraryOrg.models;

import javax.persistence.Id;
import javax.persistence.Entity;


@Entity // This tells Hibernate to make a table out of this class
public class Books {
	@Id //Specifies the primary key of an entity
	private Integer id;
	private String title;
	private String author;

	public Books() {
		
	}
	
  	public Books(Integer id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

  	public Integer getId() {
	  return id;
  	}

  	public void setId(Integer id) {
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
	@Override
	public String toString() {
		return "Books [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
}

