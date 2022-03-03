package com.springboot.libraryOrg.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This tells Hibernate to make a table out of this class
//@Table(name = "librarydb")
public class Books {
	@Id //Specifies the primary key of an entity
	@Column(name = "id") //Specified the mapped column for a persistent property or field.
	@GeneratedValue(strategy=GenerationType.AUTO)
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
}

