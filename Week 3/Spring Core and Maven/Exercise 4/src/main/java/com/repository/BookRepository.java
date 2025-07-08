package Week 3.Spring Core and Maven.Exercise 4.src.main.java.com.repository;

public class BookRepository {
    
}
package com.example.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        return Arrays.asList("Harry Potter", "The Alchemist", "To Kill a Mockingbird");
    }
}