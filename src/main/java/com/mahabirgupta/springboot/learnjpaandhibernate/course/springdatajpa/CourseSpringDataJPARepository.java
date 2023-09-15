package com.mahabirgupta.springboot.learnjpaandhibernate.course.springdatajpa;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//Create an interface when making use of SpringDataJPA
public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long> { //id type is of long and Course is the entity
//            create method to find by author
   List<Course> findByAuthor(String author);
   List<Course> findByName(String name);

}
