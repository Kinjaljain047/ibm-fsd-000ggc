package com.ibm.fsd.my_first_maven_demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester {

	public static void main(String[] args) {
			SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.openSession();
		/*Employee employee= new Employee("sachin", "tendulkar","sachin@g.com");
		session.getTransaction().begin();
		session.persist(employee);
		System.out.println("Inserted>>>");
		session.getTransaction().commit();
		*/
		
		Query query =session.createQuery("from Employee");
		
	  List <Employee> list= query.getResultList();
	  for(Employee e:list) {
		  System.out.println(e);
	  }

}
}
