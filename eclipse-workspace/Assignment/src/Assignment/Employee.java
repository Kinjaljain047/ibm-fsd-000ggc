package Assignment;

import java.sql.Date;

public class Employee implements Comparable<Employee> {
   private int id;
   private int age;
   private String dept;
   private String name;
   private Date date;
   private int salary;
public Employee() {
	super();
}
public Employee(int id, int age, String dept, String name, Date date, int salary) {
	super();
	this.id = id;
	this.age = age;
	this.dept = dept;
	this.name = name;
	this.date = date;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", age=" + age + ", dept=" + dept + ", name=" + name + ", date=" + date + ", salary="
			+ salary + "]";
}
@Override
public int compareTo(Employee emp) {
	if(this.salary==emp.salary) {
	return 0;
}else if(this.salary>emp.salary){
	return 1;
	
}else {
	return -1;
}
   
}
}
