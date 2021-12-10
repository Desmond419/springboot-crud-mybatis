package com.desmond.manage.student.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desmond.manage.student.dao.IStudentDao;
import com.desmond.manage.student.model.Student;
import com.desmond.manage.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> getAllStudent() {
        return studentDao.getAllStudent();
    }

    @Override
    public Student findStudentById(int id){
        return studentDao.findStudentById(id);
    }

    @Override
    public void addStudent(Student student) {
    	studentDao.addStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    @Override
    public void deleteStudentById(int id) {
    	studentDao.deleteStudentById(id);
    }
}
