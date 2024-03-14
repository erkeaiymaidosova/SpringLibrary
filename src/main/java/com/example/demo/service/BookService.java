package com.example.demo.service;

import com.example.demo.dto.book.BookAddRequest;
import com.example.demo.dto.book.BookResponse;

import java.util.List;

public interface BookService {
    void addBook(BookAddRequest request, String token);

    List<BookResponse> getAll(String s);

    void buy(Long bookId, String token);

    List<BookResponse> getMyBooks(String string);
}
