package com.SpringBoot.CRUD.repositories;

import com.SpringBoot.CRUD.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
