package com.bezahive.sbwbooks.services;

import com.bezahive.sbwbooks.domain.Author;
import org.springframework.stereotype.Service;

// add @Service annotation
@Service
public interface AuthorService  {


// add interable method
    Iterable<Author> listAllAuthors();






}
