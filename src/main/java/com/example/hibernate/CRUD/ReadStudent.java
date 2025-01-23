package com.example.hibernate.CRUD;

import com.example.hibernate.entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ReadStudent {
    public static Student getStudentById(Session session, int studentId){
        return session.get(Student.class, studentId);
    }

    public static List<Student> getAllStudents(Session session){
        Query<Student> query = session.createQuery("FROM Student", Student.class);
        return query.list();
    }
}
