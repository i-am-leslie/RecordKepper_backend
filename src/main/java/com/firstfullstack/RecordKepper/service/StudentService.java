package com.firstfullstack.RecordKepper.service;

import com.firstfullstack.RecordKepper.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> getALLStudents();

    public Student getStudentInfo(int id);
}
