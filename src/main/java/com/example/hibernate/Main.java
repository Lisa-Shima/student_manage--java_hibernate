package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.example.hibernate.entity.Student;
import com.example.hibernate.CRUD.*;
public class Main {
    public static void main(String[] args){
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            session.beginTransaction();

            // Create Student
            CreateStudent.createStudent(session, "Lisa", "lisa@gmail.com", "phy", 12);

            //Read Student
            Student student = ReadStudent.getStudentById(session, 1);
            if(student != null){
                System.out.println("Found student: " + student.toString());
            }

            //Update Student
            UpdateStudent.updateStudent(session, 2, "lisa2", "lisa2@gmail.com", "phy2", 14);

            //Delete Student
            DeleteStudent.deleteStudent(session, 2);

            session.getTransaction().commit();
        }
    }
}
