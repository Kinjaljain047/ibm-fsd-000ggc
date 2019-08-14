package Package2;

import java.util.Scanner;

public class Tester {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 Name name= new Name();
	 String choice;
   try {
	  System.out.println("enter firstname:");
	  String fname = sc.next();
	  System.out.println("enter last name:");
	  String lname = sc.next();
	  name.createName(fname, lname);
	  } catch (NameNotValidException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		System.err.println(e.getMessage());
	}
   
 do {
	 Name name1= new Name();
	 try {
		 System.out.println("enter first name:");
		String fname= sc.next();
		 System.out.println("enter last name:");
        String lname= sc.next();
        name1.createName(fname, lname);
        try {
           name1.compare(name,name1);
          }catch(SameNameException e) {
        	System.err.println(e.getMessage());
        }
	 }
	 catch(NameNotValidException e){
		 System.err.println(e.getMessage());
		 
	 }
	 System.out.println("do u want to create another object? (y/n)");
	 choice = sc.next();
        }while(choice.equals("y"));
}}
