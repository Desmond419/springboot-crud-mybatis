package com.desmond.manage.student.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.desmond.manage.student.model.Student;

@Mapper
public interface IStudentDao {
	List<Student> getAllStudent();
	Student findStudentById(int id);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudentById(int id);
}
