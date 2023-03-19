package com.springboot.sms.respository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.sms.entity.Student;

public interface StudentRespository extends JpaRepository<Student, Long> {
	

}
