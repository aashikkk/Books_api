package com.example.bookstore_api.repo;

import com.example.bookstore_api.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepositery extends CrudRepository<Book, Integer> {
    // CRUD Operations with DB

    List<Book> findAllByYearOfPublication(Integer yop);
}



// save to db
// update
// fetch
// delete
// crudrepository<arg1, arg2>
// arg1 - table name, arg2 - datatype of pk