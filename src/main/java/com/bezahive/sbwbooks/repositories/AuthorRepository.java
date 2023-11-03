package com.bezahive.sbwbooks.repositories;


import com.bezahive.sbwbooks.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

// add repository annotation
@Repository
// add repository rest resource annotation
@RepositoryRestResource


// add Extends CrudRepository Author, Long
public interface AuthorRepository extends CrudRepository<Author, Long> {

    //



}
