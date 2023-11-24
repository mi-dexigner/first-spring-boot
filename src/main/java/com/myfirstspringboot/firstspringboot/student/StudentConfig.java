package com.myfirstspringboot.firstspringboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//
import java.time.Month;
import java.util.List;
import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static java.time.Month.MAY;
//

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student idrees = new Student(
                    "Muhammad Idrees",
                    "midexigner@gmail.com",
                    LocalDate.of(1994, JANUARY, 18)
            );
            Student bilal = new Student(
                    "Muhammad Bilal",
                    "mbilal@gmail.com",
                    LocalDate.of(1998, MAY, 23)
            );
            repository.saveAll(
                    List.of(idrees,bilal)
            );

        };

    }
}
