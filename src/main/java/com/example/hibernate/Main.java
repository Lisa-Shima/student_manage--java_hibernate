package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.example.hibernate.entity.Student;
public class Main {
    public static void main(String[] args){
        Student student = new Student("Shima", "shima@gmail.com", "maths", 10);

        Session session = null;
        Transaction transaction = null;
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();
            System.out.println("Student saved successfully!");
        }
        catch (Exception e){
            if(transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();
        }
        finally {
            HibernateUtil.shutdown();
        }
    }
}
