package com.example.hibernate.CRUD;

import com.example.hibernate.entity.Student;
import org.hibernate.Session;

public class UpdateStudent {
    public static void updateStudent(Session session, int studentId, String newName, String newEmail, String newCourse, int newAge){
        Student student = session.get(Student.class, studentId);
        if(student != null){
            student.setName(newName);
            student.setEmail(newEmail);
            student.setCourse(newCourse);
            student.setAge(newAge);

            session.update(student);
            System.out.println("Updated Student: " + student.toString());
        }
        else {
            System.out.println("Student to update Not Found!");
        }
    }
}
