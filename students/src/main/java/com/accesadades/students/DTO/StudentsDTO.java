package com.accesadades.students.DTO;

public record StudentsDTO(
    String _id,
    String name,
    String lastname1,
    String lastname2,
    char gender,
    String email,
    String phone,
    int birth_year
) {}
