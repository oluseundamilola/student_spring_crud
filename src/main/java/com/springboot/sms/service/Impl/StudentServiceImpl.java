package com.springboot.sms.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.sms.entity.Student;
import com.springboot.sms.respository.StudentRespository;
import com.springboot.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	//Inject StudentRepository
	private StudentRespository studentRespository;
	public StudentServiceImpl(StudentRespository studentRespository) {
		super();
		this.studentRespository = studentRespository;
	}



	@Override
	public List<Student> getAllStudents() {
		return studentRespository.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRespository.save(student);
	}



	@Override
	public Student findStudentById(Long id) {
		return studentRespository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRespository.save(student);
	}



	@Override
	public void deleteStudentById(Long id) {
		 studentRespository.deleteById(id);
		
	}

}
