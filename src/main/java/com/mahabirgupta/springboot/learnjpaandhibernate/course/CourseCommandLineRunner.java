package com.mahabirgupta.springboot.learnjpaandhibernate.course;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc.CourseJDBCRepository;
import com.mahabirgupta.springboot.learnjpaandhibernate.course.jpa.CourseJPARepository;
import com.mahabirgupta.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//To make the database run at start-up
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//   private CourseJDBCRepository repository;

//    @Autowired
//    private CourseJPARepository repository;

//    Create @Autowired for SpringDataJpa
@Autowired
private CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"Learn AWS JPA!","Udemy")); //in Spring Data JPA instead of insert
                                                                                    // data save data keyword is used
        repository.save(new Course(2,"Learn Azure JPA!","Udemy"));
        repository.save(new Course(3,"Learn DevOps JPA!","Udemy"));

        repository.deleteById(1l); //1l means 1 long because passing in long data type
        System.out.println(repository.findById(2l));
        System.out.println(repository.findById(3l));
    }
}
