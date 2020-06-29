package com.api.repo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Book {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String bookId;
	
	private String bookName;
	
	private String authorName;
	
	
	@OneToMany
	private List<Page> pages;
	
	
	
	public Book()
	{
		
	}
	
	
	
	
	

	public Book( String bookName, String authorName) {
		super();
		
		this.bookName = bookName;
		this.authorName = authorName;
	}






	public Book(String bookId, String bookName, String authorName, List<Page> pages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.pages = pages;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public List<Page> getPages() {
		return pages;
	}

	public void setPages(List<Page> pages) {
		this.pages = pages;
	}
	
	

}
