package com.refresh.java.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.refresh.java.model.Book;
import com.refresh.java.repository.BookRepository;

@Service
public class BookService{
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository=bookRepository;
    }

    public Book createBook(Book book){
        return bookRepository.save(book);
    }

    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }

    public Optional<Book> getBookById(Long id){
        return bookRepository.findById(id);
    } 

    public Book updateBook(Book book) {
        // Optional business logic before saving
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}