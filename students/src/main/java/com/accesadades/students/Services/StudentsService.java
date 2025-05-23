package com.accesadades.students.Services;

import com.accesadades.students.DTO.StudentsDTO;
import com.accesadades.students.DomainModel.Students;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentsService {
    Mono<Students> save(StudentsDTO dto);
    Mono<Students> findById(String id);
    Flux<Students> findAll();
    Mono<Students> update(StudentsDTO dto);
    Mono<Void> delete(String id);
    Flux<Students> findByName(String name);

}
