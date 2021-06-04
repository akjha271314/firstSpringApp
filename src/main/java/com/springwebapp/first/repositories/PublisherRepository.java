package com.springwebapp.first.repositories;

import com.springwebapp.first.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {



}
