package com.springwebapp.first.repositories;

import com.springwebapp.first.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {



}
