package com.luv2code.myapp.dao;

import org.hibernate.Session;

import com.luv2code.entity.Instructor;
import com.luv2code.myapp.factory.InstructorFactory;

public class InstructorDaoIimpl implements InstructorDAO {

	
		private static Session session=null;
		{
			session=InstructorFactory.getMySession();
		}

		public void createInstructor(Instructor instructor) {
			
			session.getTransaction().begin();
			session.persist(instructor);
			session.getTransaction().commit();
		}

		
	}


