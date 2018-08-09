package com.girish.udemy.spring.spring5webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.girish.udemy.spring.spring5webapp.repositories.AuthorRepository;
import com.girish.udemy.spring.spring5webapp.repositories.BookRepository;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository bookRepository) {
        this.authorRepository = bookRepository;
    }

    @RequestMapping("/authors")
    public String getBooks(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
