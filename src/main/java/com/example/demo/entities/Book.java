package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String author_full_name;
    private String transcript;
    private String created_date;
    private Integer prize;
    private Integer ageAccess;
    private Boolean exist = true;

    @ManyToOne()
    private Type type;

    @ManyToOne()
    private Customer customer;



}
