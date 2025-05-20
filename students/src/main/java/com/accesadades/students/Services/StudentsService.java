package com.accesadades.students.Services;

import java.util.List;
import java.util.Optional;

public interface StudentsService<T,ID> {
    List<T> findAll();

    Optional<T> findById(ID id);

    void save(T entity);

    void deleteById(ID id);
    
}
