package com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//To make the database run at start-up
@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {

    @Autowired
   private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS Now!","Udemy"));
        repository.insert(new Course(2,"Learn Azure Now!","Udemy"));
        repository.insert(new Course(3,"Learn DevOps Now!","Udemy"));

        repository.deleteById(1);

    }
}
