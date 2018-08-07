package com.girish.udemy.spring.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.girish.udemy.spring.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
