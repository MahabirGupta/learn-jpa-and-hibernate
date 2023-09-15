package com.mahabirgupta.springboot.learnjpaandhibernate.course;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

//Create an entity to link/map the Course directly to the database
@Entity
public class Course {

//    add primary key
    @Id
    private long id;
    @Column(name = "name") //not mandatory. Can remove it
    private String name;
    @Column(name = "author") //not mandatory. Can remove it
    private String author;

//    Create constructor

    public Course() {
    }

    public Course(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

//    Create getters

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

//    Create setters

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    Create toString()

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
