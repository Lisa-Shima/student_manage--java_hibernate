package com.example.hibernate.CRUD;

import com.example.hibernate.entity.Student;
import org.hibernate.Session;

public class CreateStudent {
    public static void createStudent(Session session, String name, String email, String course, int age){
        Student student = new Student(name, email, course, age);
        session.save(student);
        System.out.println("Student created: " + student.toString());
    }
}
