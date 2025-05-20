package com.accesadades.students.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.accesadades.students.DTO.StudentsDTO;
import com.accesadades.students.DomainModel.Students;

@Mapper(componentModel = "spring")
public interface StudentsMapper {

    StudentsMapper INSTANCE = Mappers.getMapper(StudentsMapper.class);

    StudentsDTO toDto(Students student);

    Students toEntity(StudentsDTO dto);
}
