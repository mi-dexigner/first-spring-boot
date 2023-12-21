package com.myfirstspringboot.firstspringboot;

import com.myfirstspringboot.firstspringboot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class FirstspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "No Routes Set this please find the correct route";
	}

//	@GetMapping
//	public List<String> listData(){
//		return List.of("Hello", "Wolrd");
//	}

//	@GetMapping
//	public List<Student> hello(){
//		return List.of(
//				new Student(
//						1L,
//						"Muhammad Idrees",
//						"midexigner@gmail.com",
//						LocalDate.of(1994, Month.JANUARY,18)
//				)
//		);
//	}

}

