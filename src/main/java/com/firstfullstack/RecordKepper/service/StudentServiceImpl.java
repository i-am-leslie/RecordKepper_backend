package com.firstfullstack.RecordKepper.service;

import com.firstfullstack.RecordKepper.model.Student;
import com.firstfullstack.RecordKepper.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements  StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getALLStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentInfo(int id) {
        for(int i=0; i<getALLStudents().size(); i++){
            if(getALLStudents().get(i).getId()==id){
                return getALLStudents().get(i);
            }
        }
        return null;
    }
}
