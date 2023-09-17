package com.firstfullstack.RecordKepper.controller;

import com.firstfullstack.RecordKepper.model.Student;
import com.firstfullstack.RecordKepper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
   private  StudentService  studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return"New student added";
    }
    @GetMapping("/getAll")
    public List<Student> getAllStudent(){
        return studentService.getALLStudents();

    }
    //Yet to Implement
    @GetMapping("/getStudent/{id}")
    public String getStudent(@PathVariable int id){
        if(studentService.getStudentInfo(id)==null){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        return studentService.getStudentInfo(id).toString();

    }
    //Yet to implement
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        if(studentService.getStudentInfo(id)==null){
            throw new ResponseStatusException(HttpStatus.NO_CONTENT);
        }
        return "Student with id= " + id +" has been deleted" ;

    }

}
