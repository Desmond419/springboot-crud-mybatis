package com.desmond.manage.student.service;

import java.util.List;

import com.desmond.manage.student.model.Student;

public interface StudentService {
	List<Student> getAllStudent();
	Student findStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(int id);
}
