package com.bezahive.sbwbooks.services;

import com.bezahive.sbwbooks.domain.Book;
import com.bezahive.sbwbooks.repositories.BookRepository;
import org.springframework.stereotype.Service;

// add @Service annotation
@Service
public class BookServiceImpl implements BookService {
  // add publisherRepository
    private BookRepository bookRepository;

// add constructor with publisherRepository and this.publisherRepository = publisherRepository;

    public BookServiceImpl(BookRepository bookRepository) {

        this.bookRepository = bookRepository;

    }

    // add findAllbooks method rturn publisherRepository.findAll();
    public Iterable<Book> findAllBooks() {
        return bookRepository.findAll();
    }



}
