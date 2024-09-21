package com.onlinebookstore.bookstore.controller;

import com.onlinebookstore.bookstore.entity.Bookentity;
import com.onlinebookstore.bookstore.service.Bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class Bookcontroller {
	
	@Autowired
	private Bookservice bookservice;
	
	@GetMapping
	public List<Bookentity> getAllBooks() {
		return bookservice.getAllBooks();
	}
	
	@GetMapping("/{id}")
	public Bookentity getBookById(@PathVariable Long id) {
		return bookservice.getBookById(id);
	}
	
	@PostMapping
	public Bookentity addBookentity(@RequestBody Bookentity book) {
		return bookservice.addBook(book);
	}
	
	@DeleteMapping("/{id}")
	public void deleteBook(@PathVariable Long id) {
		bookservice.deleteBook(id);
	}
	
}


