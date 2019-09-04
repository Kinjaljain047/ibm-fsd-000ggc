package com.one.entity;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDetails {
public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class)
				.buildSessionFactory();

		
		Session session=factory.getCurrentSession();
		
		session.beginTransaction();
		System.out.println("enter the id to be deleted:");
		int id= sc.nextInt();
		Instructor tempins= session.get(Instructor.class, id);
		System.out.println("Found instructor: " + tempins);
		if (tempins != null) {
			
			System.out.println("Deleting: " + tempins);
			
			session.delete(tempins);				
		}
		
				session.getTransaction().commit();
		
		System.out.println("Done!");
	}
		
}

