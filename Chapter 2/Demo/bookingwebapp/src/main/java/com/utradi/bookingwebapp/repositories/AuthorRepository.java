package com.utradi.bookingwebapp.repositories;

import com.utradi.bookingwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
