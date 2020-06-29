package com.api.repo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Page {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String pageId;
	
	private String pageContent ;
	
	@ManyToOne
	private Book book;
	
	
	public Page()
	{
		
	}


	public Page(String pageId, String pageContent, Book book) {
		super();
		this.pageId = pageId;
		this.pageContent = pageContent;
		this.book = book;
	}


	public String getPageId() {
		return pageId;
	}


	public void setPageId(String pageId) {
		this.pageId = pageId;
	}


	public String getPageContent() {
		return pageContent;
	}


	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
	

}
