package com.mahabirgupta.springboot.learnjpaandhibernate.course.jdbc;

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
        repository.insert();
    }
}
