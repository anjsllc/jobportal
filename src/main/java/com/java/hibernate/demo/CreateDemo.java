package com.java.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.java.hibernate.entity.Instructor;
import com.java.hibernate.entity.InstructorDetail;
import com.java.hibernate.entity.Student;

public class CreateDemo {
	public static void main(String[] args) {
		
		//create session factory, session
		SessionFactory factory=new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory();
		
		Session session=factory.getCurrentSession();
		
		try {
			/*Instructor tempInstructor=new Instructor("Tharun", "jasti", "tharunjasti@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("Channel1", "watching movies");
			tempInstructor.setInstructorDetail(tempInstructorDetail);*/
			
			Instructor tempInstructor=new Instructor("jkfkj12", "nfln12", "e23fjjnf@gmail.com");
			InstructorDetail tempInstructorDetail=new InstructorDetail("youtube:wj23kvkffe", "wfv23wfw");
			tempInstructor.setInstructorDetail(tempInstructorDetail);
		
			
			session.beginTransaction();
			
			//this will also save details object beacuse of casadeType=ALL
			session.save(tempInstructor);
			
			session.getTransaction().commit();
			
			System.out.println("Saving in database::"+tempInstructor);
		} finally {
			factory.close();
		}
		
	}


}
