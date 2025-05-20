package com.accesadades.students.DomainModel;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "students")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Students implements Serializable {
	@Id
    private Long _id;
    private String name;
    private String lastname;
    private char gender;
    private String email;
    private String phone;
    private int birth_year;
 }


