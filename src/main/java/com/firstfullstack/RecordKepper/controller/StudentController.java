package com.firstfullstack.RecordKepper.controller;

import com.firstfullstack.RecordKepper.model.Student;
import com.firstfullstack.RecordKepper.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
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
    @GetMapping("/getStudent")
    public String getStudent(@RequestParam("id") int id){
        return studentService.getStudentInfo(id).toString();

    }

}
