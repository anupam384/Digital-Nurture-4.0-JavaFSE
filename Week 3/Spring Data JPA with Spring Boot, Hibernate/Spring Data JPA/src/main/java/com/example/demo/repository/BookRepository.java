package Week 3.Spring Data JPA with Spring Boot, Hibernate.Spring Data JPA.src.main.java.com.example.demo.repository;

public class BookRepository {
    
}
package com.example.demo.repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // You can add custom methods if needed
}