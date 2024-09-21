package com.onlinebookstore.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.onlinebookstore.bookstore.entity.Bookentity;

public interface Bookrepository extends JpaRepository<Bookentity, Long>{
	
	
}
