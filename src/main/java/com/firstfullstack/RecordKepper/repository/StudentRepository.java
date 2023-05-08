package com.firstfullstack.RecordKepper.repository;

import com.firstfullstack.RecordKepper.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
