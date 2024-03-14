package com.example.demo.mapper;

import com.example.demo.dto.book.BookResponse;
import com.example.demo.entities.Book;

import java.util.List;

public interface BookMapper {
    List<BookResponse> toDtoS(List<Book> all);

    BookResponse toDto(Book book);
}

