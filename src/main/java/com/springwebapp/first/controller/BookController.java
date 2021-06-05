package com.springwebapp.first.controller;

import com.springwebapp.first.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/bookList")
    public String getBooks(Model model){

        model.addAttribute("books",bookRepository.findAll());

        return "bookList";
    }

}
