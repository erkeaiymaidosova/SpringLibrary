package com.example.demo.dto.book;

import com.example.demo.entities.Type;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponse {
    private Long id;

    private String name;
    private String author_full_name;
    private String transcript;
    private String created_date;
    private Integer prize;
    private Integer age_access;
    private Boolean exist;
    private String type;
}
