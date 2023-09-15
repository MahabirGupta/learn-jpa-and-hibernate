package com.mahabirgupta.springboot.learnjpaandhibernate.course;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc.CourseJDBCRepository;
import com.mahabirgupta.springboot.learnjpaandhibernate.course.jpa.CourseJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//To make the database run at start-up
@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//    @Autowired
//   private CourseJDBCRepository repository;

    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS JPA!","Udemy"));
        repository.insert(new Course(2,"Learn Azure JPA!","Udemy"));
        repository.insert(new Course(3,"Learn DevOps JPA!","Udemy"));

        repository.deleteById(1);
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
