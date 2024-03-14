package com.example.demo.service;

import com.example.demo.dto.type.TypeResponse;

import java.util.List;

public interface TypeService {
    void addType(String name, String token);

    List<TypeResponse> getAll();
}
