package com.example.bookstore_api.repo;

import com.example.bookstore_api.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface BookRepositery extends CrudRepository<Book, Integer> {
    // CRUD Operations with DB

    List<Book> findAllByYearOfPublicationInAndBookType(Set<Integer> yop, String bookType);

    String rawQuery = "SELECT * FROM book WHERE year_of_publication IN (:yop)";
//    String rawQuery = "SELECT * FROM book WHERE year_of_publication IN ?1";

    @Query(nativeQuery = true, value = rawQuery)
    List<Book> findAllByYearOfPublicationIn(@Param("yop") Set<Integer> yop);
}

// Need to use In at the end inorder to get Multiple params.
// Ex:
// SELECT * FROM Customers
// WHERE Country IN ('Germany', 'France', 'UK');

// If we add another query, AND will Add there with convention.

// save to db
// update
// fetch
// delete
// crudrepository<arg1, arg2>
// arg1 - table name, arg2 - datatype of pk