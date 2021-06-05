package com.springwebapp.first.controller;

import com.springwebapp.first.repositories.AuthorRepository;
import com.springwebapp.first.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authorList")
    public String getAuthor(Model model){

        model.addAttribute("authors",authorRepository.findAll());

        return "/authorList";
    }

}
