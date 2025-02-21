package com.refresh.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embedded;

@Entity
public class Book{
    @ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String author;
    private int isbn;
    private LocalDate publishedDate;

    public Book(){}

    public Book(long id, String title,String author, int isbn, LocalDate publishedDate){
        this.id= id;
        this.title = title;
        this.author= author;
        this.isbn= isbn;
        this.publishedDate= publishedDate;
    }   

    public long getID(){
        return this.id;
    }

    public void setID(long id){
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

    public int getISBN(){
        return this.isbn;
    }

    public void setISBN(int isbn){
        this.isbn = isbn;
    }   

    public LocalDate getPublishedDate(){
        return this.publishedDate;
    }

    public void setPublishedDate(int publishedDate){
        this.isbn = isbn;
    }   
    
    public String toString(){
        return  "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", publishedDate=" + publishedDate + "]";
    }
}
