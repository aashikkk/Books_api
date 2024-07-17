package com.example.bookstore_api.service;

import com.example.bookstore_api.entity.Book;
import com.example.bookstore_api.repo.BookRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    // CRUD Operations with Controller.

    @Autowired
    private BookRepositery bookRepositery;

    //GET
    public List<Book> getBooks(){
        List<Book> bookList = new ArrayList<>();

        bookRepositery.findAll().forEach(
                bookList::add
//                book -> bookList.add(book)
        );
        return bookList;
    }

    // Create
    public Book createBook(Book book){
        return bookRepositery.save(book);
    }

    // Get By id - single source
    public Optional<Book> getBookById(Integer bookId){
        return bookRepositery.findById(bookId);
    }

    // Update book
    public Book updateBook(Book incomingBook) {
        return bookRepositery.save(incomingBook);
    }

    // Delete book by id
    public String deleteById(Integer bookId) {
        bookRepositery.deleteById(bookId);
        return "Book Successfully deleted";
    }
}


//    static List<Book> bookList =  Arrays.asList(
//            new Book(1, "States 2", "desc of states 2", 2007, "fiction"),
//            new Book(2, "States 3", "desc of states 3", 2017, "adventure"),
//            new Book(3, "States 4", "desc of states 4", 2024, "cartoon")
//
//    );

//Idea
//Array list ondu create panni, repostitory la iruntu push panra array ku

/*

* Old
    * public Book getBookById(Integer bookId){
        return bookRepositery.findById(bookId);
    }
*
* New
    * public Optional<Book> getBookById(Integer bookId){
        return bookRepositery.findById(bookId);
    }
    *
*
To handle null pointer exceptions.

* */
