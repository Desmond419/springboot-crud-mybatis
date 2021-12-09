package com.desmond.manage.student.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.desmond.manage.student.model.Student;

@Mapper
public interface IStudentDao {
	public List<Student> getAllStudent();
    public Student saveOrUpdateStudent(Student student);
    public void deleteStudentById(int id);
}
