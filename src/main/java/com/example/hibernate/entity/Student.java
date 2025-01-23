package com.example.hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column
    private String course;

    @Column
    private int age;

    public Student(){}

    public Student(String name, String email, String course, int age){
        this.name = name;
        this.email = email;
        this.age = age;
        this.course = course;
    }

    // Getters

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getCourse(){
        return course;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }

    // Setters
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCourse(String course){
        this.course = course;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return "Student [id= " + id + ", name= " + name + ", email= " + email + ", course= " + course +", age= " + age + "]";
    }

}
