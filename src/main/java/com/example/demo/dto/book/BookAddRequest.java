package com.example.demo.dto.book;

import com.example.demo.entities.Type;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookAddRequest {
    private String name;
    private String author_full_name;
    private String transcript;
    private Integer prize;
    private Integer age_access;
    private String type;
}
