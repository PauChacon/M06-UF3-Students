package com.accesadades.students.Repositories;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.stereotype.Repository;

import com.accesadades.students.DomainModel.Students;

import reactor.core.publisher.Flux;

@Repository
@EnableReactiveMongoRepositories
public interface StudentsRepo extends ReactiveMongoRepository<Students, String>{

    @Query("{ 'name': { $regex: ?0, $options: 'i' } }")
    Flux<Students> findByName(String name);

    
}
