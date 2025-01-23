package com.example.hibernate.CRUD;

import com.example.hibernate.entity.Student;
import org.hibernate.Session;

public class DeleteStudent {
    public static void deleteStudent(Session session, int studentId){
        Student student = session.get(Student.class, studentId);
        if(student != null){
            session.delete(student);
            System.out.println("Deleted student with ID: " + student.getId());
        }
        else{
            System.out.println("Student to delete Not Found!");
        }
    }
}
