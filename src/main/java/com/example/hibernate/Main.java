package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.example.hibernate.entity.Student;
public class Main {
    public static void main(String[] args){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();

        try{
            Student student = new Student("Shima", "shima", "shima@gmail.com");

            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

            System.out.println("Student saved successfully!");
        }
        finally {
            sessionFactory.close();
        }
    }
}
