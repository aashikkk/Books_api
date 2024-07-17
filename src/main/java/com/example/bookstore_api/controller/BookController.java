package com.example.bookstore_api.controller;

import com.example.bookstore_api.entity.Book;
import com.example.bookstore_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // GET
    @GetMapping
    public List<Book> getBooks(@RequestParam(value = "yearOfPublications", required = false) Set<Integer> yop){
        return bookService.getBooks(yop);
    }

    // Create
    @PostMapping
    public Book createBook(@RequestBody Book book){
        return bookService.createBook(book);
    }

    // Get By Id
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable("id") Integer bookId){
        return bookService.getBookById(bookId);
    }

    // Update
    @PutMapping
    public Book updateBook(@RequestBody Book incomingBook){
        return bookService.updateBook(incomingBook);
    }

    // delete by id
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Integer bookId){
        return bookService.deleteById(bookId);
    }
}
