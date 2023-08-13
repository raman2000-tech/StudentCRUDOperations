package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int student_id;
	private String student_name;
	private String student_state;
	private int student_age;
	
	public Student() {
		
	}
	public Student(int student_id, String student_name, String student_state, int student_age) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_state = student_state;
		this.student_age = student_age;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_state() {
		return student_state;
	}
	public void setStudent_state(String student_state) {
		this.student_state = student_state;
	}
	public int getStudent_age() {
		return student_age;
	}
	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_state="
				+ student_state + ", student_age=" + student_age + "]";
	}
	
}
