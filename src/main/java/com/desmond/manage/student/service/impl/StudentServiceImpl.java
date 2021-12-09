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
    public Student saveOrUpdateStudent(Student student) {
    	return studentDao.saveOrUpdateStudent(student);
    }

    @Override
    public void deleteStudentById(int id) {
    	studentDao.deleteStudentById(id);
    }
}
