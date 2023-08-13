package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentCRUDApplication {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index() {
		return "Spring Boot CRUD Application!!!";
	}
	// Handler for creating new record in DB
	@PostMapping("/saveapi")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	//Handler for fetch a single record
	@GetMapping("/getStudent/{student_id}")
	public Student getStudentData(@PathVariable int student_id) {
		Optional<Student> student = studentRepository.findById(student_id);
		Student student1 = student.get();
		return student1;
	}
	// Handler for fetch all data from DB
	@GetMapping("/getAllStudent")
	public List<Student> getAll() {
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}
	//Handler for delete a particular record from DB
	@DeleteMapping("/deleteapi/{student_id}")
	public String deleteStudent(@PathVariable int student_id) {
		Student student = studentRepository.findById(student_id).get();
		if(student!=null)
			studentRepository.delete(student);
		return "Deleted Successfully!!!";
	}
	//Handler for updating a particular record
	@PutMapping("/updateapi")
	public Student updateStudentData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
		
	}
	
}
