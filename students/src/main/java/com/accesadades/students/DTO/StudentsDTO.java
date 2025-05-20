package com.accesadades.students.DTO;

public record StudentsDTO(
    Long _id,
    String name,
    String lastname,
    char gender,
    String email,
    String phone,
    int birth_year
) {}
