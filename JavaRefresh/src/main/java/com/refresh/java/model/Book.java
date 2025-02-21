package com.refresh.java.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;

@Entity
public class Book{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private int isbn;
    private LocalDate publishedDate;

    public Book(){}

    public Book(Long id, String title,String author, int isbn, LocalDate publishedDate){
        this.id= id;
        this.title = title;
        this.author= author;
        this.isbn= isbn;
        this.publishedDate= publishedDate;
    }   

    public Long getID(){
        return this.id;
    }

    public void setID(Long id){
        this.id = id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getIsbn(){
        return this.isbn;
    }

    public void setIsbn(int isbn){
        this.isbn = isbn;
    }   

    public LocalDate getPublishedDate(){
        return this.publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate){
        this.publishedDate =publishedDate;
    }   
    
    public String toString(){
        return  "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", publishedDate=" + publishedDate + "]";
    }
}
