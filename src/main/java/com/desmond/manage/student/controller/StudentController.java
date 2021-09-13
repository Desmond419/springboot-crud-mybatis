package com.desmond.manage.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desmond.manage.student.model.Student;
import com.desmond.manage.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
    private StudentService studentService;

    @RequestMapping("/getAllStudent")
    public List<Student> getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        return list;
    }

    @RequestMapping("/addStudent")
    public void addStudent(Student student) {
    	studentService.addStudent(student);
    }

    @RequestMapping("/deleteById")
    public void deleteStudentById(int id) {
    	studentService.deleteStudentById(id);
    }
}
