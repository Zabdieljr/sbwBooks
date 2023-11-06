package com.bezahive.sbwbooks.services;

import com.bezahive.sbwbooks.domain.Author;
import com.bezahive.sbwbooks.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

// add @Service annotation
@Service
public class AuthorServiceImpl implements AuthorService {
    // add publisherRepository
    private AuthorRepository authorRepository;

    // add constructor with publisherRepository and this.publisherRepository = publisherRepository;
    public AuthorServiceImpl(AuthorRepository authorRepository) {

        this.authorRepository = authorRepository;

    }


    @Override
    public Iterable<Author> listAllAuthors() {
        return authorRepository.findAll();
    }
}
