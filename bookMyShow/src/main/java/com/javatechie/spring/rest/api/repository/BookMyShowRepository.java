package com.javatechie.spring.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.rest.api.model.BookRequest;

public interface BookMyShowRepository extends JpaRepository<BookRequest, Integer>{

}
