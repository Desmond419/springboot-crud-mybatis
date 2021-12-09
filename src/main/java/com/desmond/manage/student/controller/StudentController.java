package com.desmond.manage.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.desmond.manage.student.model.Student;
import com.desmond.manage.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveOrUpdateStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudentById(@PathVariable("id") int id) {
    	studentService.deleteStudentById(id);
    }
}
