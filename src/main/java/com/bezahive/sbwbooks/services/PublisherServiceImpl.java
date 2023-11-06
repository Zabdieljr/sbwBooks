package com.bezahive.sbwbooks.services;

import com.bezahive.sbwbooks.domain.Publisher;
import com.bezahive.sbwbooks.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

// add @Service annotation
@Service
public class PublisherServiceImpl implements PublisherService {
    // add publisherRepository
       private PublisherRepository publisherRepository;

        // add constructor with publisherRepository and this.publisherRepository = publisherRepository;
public PublisherServiceImpl(PublisherRepository publisherRepository) {

        this.publisherRepository = publisherRepository;

    }
    // add findAllPublishers method return publisherRepository.findAll();
    public Iterable<Publisher> findAllPublishers() {

    return publisherRepository.findAll();
     }

}
