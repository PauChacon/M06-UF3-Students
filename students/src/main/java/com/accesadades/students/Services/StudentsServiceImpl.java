package com.accesadades.students.Services;

import org.springframework.stereotype.Service;

import com.accesadades.students.DTO.StudentsDTO;
import com.accesadades.students.DomainModel.Students;
import com.accesadades.students.Mappers.StudentsMapper;
import com.accesadades.students.Repositories.StudentsRepo;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentsServiceImpl implements StudentsService {

    private final StudentsRepo studentsRepo;
    private final StudentsMapper studentsMapper;

    @Override
    public Mono<Students> save(StudentsDTO dto) {
        return studentsRepo.save(studentsMapper.toEntity(dto));
    }

    @Override
    public Mono<Students> findById(String id) {
        return studentsRepo.findById(id);
    }

    @Override
    public Flux<Students> findAll() {
        return studentsRepo.findAll();
    }

   @Override
public Mono<Students> update(StudentsDTO dto) {
    return studentsRepo.findById(dto._id())
            .map(existing -> studentsMapper.toEntity(dto))
            .flatMap(studentsRepo::save);
}


    @Override
    public Mono<Void> delete(String id) {
        return studentsRepo.deleteById(id);
    }
    @Override
    public Flux<Students> findByName(String name) {
    return studentsRepo.findByName(name);
    }

}
