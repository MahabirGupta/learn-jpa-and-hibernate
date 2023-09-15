package com.mahabirgupta.springboot.learnjpaandhibernate.course.jpa;

import com.mahabirgupta.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // To communicate with the Db
@Transactional // Whenever you want to execute queries with JPA, you need to have a @Transaction enabled.
public class CourseJPARepository {
//    Use EntityManager to manage the Entity

//    @Autowired // in order to use the EntityManager need to Autowire first
    @PersistenceContext // use @PersistenceContext as the annotation as it is more specific than @Autowired
    private EntityManager entityManager;

//    Insert courses in table
    public void insert(Course course){
        entityManager.merge(course); //to insert the courses
    }

//    Find course by id
    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }

    //    delete course by id
    public void deleteById(long id){
       Course course= entityManager.find(Course.class,id);
        entityManager.remove(course);
    }
}
