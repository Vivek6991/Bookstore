package com.onlinebookstore.bookstore.service;

import com.onlinebookstore.bookstore.entity.Bookentity;
import com.onlinebookstore.bookstore.repository.Bookrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Bookservice {
	
	@Autowired
	private Bookrepository bookrep;
	
	public List<Bookentity> getAllBooks() {
		return bookrep.findAll();
	}
	
	public Bookentity getBookById (Long id) {
		return bookrep.findById(id).orElse(null);
	}
	
	public Bookentity addBook(Bookentity book) {
		return bookrep.save(book);
	}
	
	public void deleteBook(long id) {
		bookrep.deleteById(id);
	}
}