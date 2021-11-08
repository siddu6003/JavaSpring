package com.example.demo.student;

import java.time.LocalDate;

public class student {
	
	// student params
	
	private long id;
	private String name;
	private int age;
	private LocalDate dob;
	private String email;
   	
	// constructors
	public student(long id, String name, int age, LocalDate dob, String email) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.email = email;
	}
	
	// Gettters and Setters
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", age=" + age + ", dob=" + dob + ", email=" + email + "]";
	}
	
	// to string
	
	
}
