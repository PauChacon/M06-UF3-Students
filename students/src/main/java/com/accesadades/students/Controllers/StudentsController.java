package com.accesadades.students.Controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accesadades.students.DTO.StudentsDTO;
import com.accesadades.students.DomainModel.Students;
import com.accesadades.students.Services.StudentsService;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentsController {

    private final StudentsService studentsService;

    @PostMapping("/save")
    public Mono<Students> save(@RequestBody StudentsDTO dto) {
        return studentsService.save(dto);
    }

    @GetMapping("/{id}")
    public Mono<Students> findById(@PathVariable String id) {
        return studentsService.findById(id);
    }

    @GetMapping("/all")
    public Flux<Students> findAll() {
        return studentsService.findAll();
    }

    @PutMapping("/update")
    public Mono<Students> update(@RequestBody StudentsDTO dto) {
        return studentsService.update(dto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return studentsService.delete(id);
    }
    @GetMapping("/name/{name}")
    public Flux<Students> findByName(@PathVariable String name) {
    return studentsService.findByName(name);
    }

}
