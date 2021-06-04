package com.springwebapp.first.repositories;

import com.springwebapp.first.model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book,Long> {



}
