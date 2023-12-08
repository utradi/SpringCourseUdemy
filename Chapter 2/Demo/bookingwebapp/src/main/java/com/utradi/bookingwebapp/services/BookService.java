package com.utradi.bookingwebapp.services;

import com.utradi.bookingwebapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
