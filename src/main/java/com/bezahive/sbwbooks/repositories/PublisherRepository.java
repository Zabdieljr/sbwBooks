package com.bezahive.sbwbooks.repositories;

import com.bezahive.sbwbooks.domain.Publisher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// add repository annotation
@Repository
// add extends CrudRepository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {


}
