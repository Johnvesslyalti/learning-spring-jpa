package com.example.jpaexample1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpaexample1.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
