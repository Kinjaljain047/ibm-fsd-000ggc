package com.mycompany.Spring_05_sept;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbctemplate.Employee;
import jdbctemplate.EmpoyeeDao;

/**
 * Hello world!
 *s
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc= new Scanner(System.in);
    	 ClassPathXmlApplicationContext context=
         		new ClassPathXmlApplicationContext("applicationContext.xml");
         EmpoyeeDao dao=context.getBean("edao",EmpoyeeDao.class);
         
        dao.createEmployee(new Employee("Sourav"));
        System.out.println("enter id to be deleted:");
        int id=sc.nextInt();
        dao.deleteEmployee(id);
    }
}
