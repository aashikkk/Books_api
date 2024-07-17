package com.example.bookstore_api.entity;

import jakarta.persistence.*;

@Entity
//@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private Integer yearOfPublication;
    private String bookType;

    public Book(Integer id, String name, String description, Integer yearOfPublication, String bookType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearOfPublication = yearOfPublication;
        this.bookType = bookType;
    }

    // default constructor to run without any error for entity without no args and public.
    public Book() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}

// to connect db, if table name differs put table and name value.

//@GeneratedValue(strategy = GenerationType.AUTO)
// Add auto increment in db

// if column name differs
//@Column(name = "desc")
