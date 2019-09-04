package com.one.entity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateInstructor {
	
		
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		
		Session session=factory.getCurrentSession();

		System.out.println("enter the first name:");
	       String firstname=sc.next();
	       System.out.println("enter the last name:");
	       String lastname= sc.next();
	       System.out.println("enter email:");
	       String email=sc.next();
	       System.out.println("enter youtube channel:");
	       String youtube_channel=sc.next();
	       System.out.println("enter hobby:");
	       String hobby=sc.next();
			try {			
				
								
				Instructor tempInstructor = 
						new Instructor(firstname,lastname,email);
				
				InstructorDetail tempInstructorDetail =
						new InstructorDetail(
								youtube_channel,
								hobby);		
				
				
				tempInstructor.setInstructorDetail(tempInstructorDetail);
				
				
				session.beginTransaction();
				
				
				System.out.println("Saving instructor: " + tempInstructor);
				session.save(tempInstructor);					
				
				
				session.getTransaction().commit();
				
				System.out.println("Done!");
			}
			finally {
				factory.close();
			}
		}

}

