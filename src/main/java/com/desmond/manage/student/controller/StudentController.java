package com.desmond.manage.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.desmond.manage.student.model.Student;
import com.desmond.manage.student.service.StudentService;

@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent() {
        try{
            return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/student")
    public ResponseEntity<Void> addStudent(@RequestBody Student student) {
        try{
            studentService.addStudent(student);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/student")
    public ResponseEntity<Void> updateStudent(@RequestBody Student student) {
        try{
            studentService.updateStudent(student);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Void> deleteStudentById(@PathVariable("id") int id) {
        try{
            Student foundStudent = studentService.findStudentById(id);
            if(foundStudent.getId() == id){
                studentService.deleteStudentById(foundStudent.getId());
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
