package com.myfirstspringboot.firstspringboot.student;

//import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents(){
        return studentRepository.findAll();
//        return List.of(
//                new Student(1L, "Muhammad Idrees", "midexigner@gmail.com", LocalDate.of(1994, Month.JANUARY, 18), 29),
//                new Student(2L, "Muhammad Bialal", ",mbilal@gmail.com", LocalDate.of(1998, Month.MAY, 23), 25)
//
//        );
    }

    public void addNewStudent(Student student) {
    System.out.println(student);
    }
}
