package com.example.demo.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DemoApplication;

@RestController
@RequestMapping(path="/api/v1/student")

public class StudentController {
	
	@GetMapping
	public List<student> getStudents() {
		List<student> l=new ArrayList<>();
		l.add(new student(1,"siddu",20,LocalDate.of(2001,8,29),"siddu6003@gmail.com"));
		l.add(new student(2,"sai",25,LocalDate.of(1996,5,27),"sai600@gmail.com"));
		return l;
	}
	/*public static void main(String[] args) {
		SpringApplication.run(StudentController.class, args);
		}*/
}
