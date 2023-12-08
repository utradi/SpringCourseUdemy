package com.utradi.bookingwebapp.services;

import com.utradi.bookingwebapp.domain.Book;
import com.utradi.bookingwebapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements  BookService{
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    private  final BookRepository bookRepository;
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
