package com.project1.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    // empty - Spring generates save(), findAll(), findById(), deleteById() automatically
}