package com.mycompany.spring_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import entity.EmpConfig;
import entity.Employee;
import entity.EmployeeDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(EmpConfig.class);
        EmployeeDao emp= context.getBean("empl", EmployeeDao.class);
      //  Employee e= context.getBean("emp",Employee.class);
        emp.createEmployee(new Employee(4,"smriti"));
        
    }
}
