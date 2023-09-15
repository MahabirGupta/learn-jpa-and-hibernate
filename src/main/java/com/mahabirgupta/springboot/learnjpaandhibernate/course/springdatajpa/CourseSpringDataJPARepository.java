package com.mahabirgupta.springboot.learnjpaandhibernate.course.springdatajpa;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

//Create an interface when making use of SpringDataJPA
public interface CourseSpringDataJPARepository extends JpaRepository<Course,Long> { //id type is of long and Course is the entity

}
