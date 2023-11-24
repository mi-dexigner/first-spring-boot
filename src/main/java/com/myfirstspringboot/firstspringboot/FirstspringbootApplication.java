package com.myfirstspringboot.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class FirstspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstspringbootApplication.class, args);
	}

//	@GetMapping
//	public String hello(){
//		return "Hello Wolrd";
//	}

	@GetMapping
	public List<String> listData(){
		return List.of("Hello", "Wolrd");
	}

}

