package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.api.repo.Book;
import com.api.repo.BookRepository;

@SpringBootApplication
@ComponentScan("com")
public class CourseApiApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
		
		
		
		
	}

}
