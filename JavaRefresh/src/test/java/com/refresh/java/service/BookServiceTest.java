package com.refresh.java.service;

import static org.junit.jupiter.api.Assertions.*;

import com.refresh.java.model.Book;
import com.refresh.java.repository.BookRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BookServiceTest {

    private BookRepository bookRepository;
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        // Use Mockito to create a mock BookRepository instance
        bookRepository = Mockito.mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    public void testCreateBook() {
        // Create a sample book
        Book book = new Book();
        book.setTitle("Effective Java");
        book.setAuthor("Joshua Bloch");
        book.setIsbn(123456);

        // Define behavior for the mocked repository (for example, return the same book when saved)
        Mockito.when(bookRepository.save(book)).thenReturn(book);

        // Call the service method to create the book
        Book createdBook = bookService.createBook(book);

        // Verify that the repository's save method was called and the book is returned
        Mockito.verify(bookRepository).save(book);
        assertNotNull(createdBook);
        assertEquals("Effective Java", createdBook.getTitle());
    }
}
