package com.bezahive.sbwbooks.repositories;


import com.bezahive.sbwbooks.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// add repository annotation
@Repository
// add extends CrudRepository Entity, Long
public interface BookRepository extends CrudRepository<Book, Long> {




}
