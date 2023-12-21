package com.myfirstspringboot.firstspringboot.student;

//import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

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
            Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
            if(studentByEmail.isPresent()){
                throw new IllegalStateException("Email Taken");
            }
            studentRepository.save(student);
            System.out.println(student);
    }

    public void deleteStudent(Long studentId) {
        boolean exists = studentRepository.existsById(studentId);
                if(!exists){
                    throw new IllegalStateException(
                            "student with id " + studentId + " does not exists"
                    );
                }
                studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student with id " + studentId + " does not exists"));
    if(name !=null && name.length()>0 && !Objects.equals(student.getName(),name)){
        student.setName(name);
    }
    if(email !=null && email.length()>0 && !Objects.equals(student.getEmail(),email)){
        student.setEmail(email);
    }
    }
}
