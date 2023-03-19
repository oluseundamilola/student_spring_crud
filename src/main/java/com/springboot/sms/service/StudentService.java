package com.springboot.sms.service;

import java.util.List;

import com.springboot.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student findStudentById(Long id);
	Student updateStudent(Student student);
	void deleteStudentById(Long id);
}
