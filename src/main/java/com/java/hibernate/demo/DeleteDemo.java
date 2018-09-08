package com.java.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.entity.Instructor;
import com.java.hibernate.entity.InstructorDetail;
import com.java.hibernate.entity.Student;

public class DeleteDemo {
	public static void main(String[] args) {

		// create session factory, session
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();
			
			int id=8;
			Instructor tempInstructor=session.get(Instructor.class, id);			
			System.out.println(tempInstructor);
			
			if(tempInstructor != null) {
				System.out.println("Deleting--");
				session.delete(tempInstructor);
			}
			

			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}

}
