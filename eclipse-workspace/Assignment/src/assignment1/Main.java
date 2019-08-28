package assignment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   Contact con= new Contact();
	   System.out.println("enter no of employees:");
	   int count= sc.nextInt();
	   for(int i=1;i<=count;i++) {
		   System.out.println("enter contact "+i+"details:");
		   String name= sc.next();
		   String email= sc.next();
		   String address= sc.next();
		   Long mobile= sc.nextLong();
	   }
		   int res=con.compareTo(con);
		   if(res==0) {
			   System.out.println("numbers are equal");
			   
		   }else if(res==1) {
			   System.out.println("sorted in ascending order");
		   }else {
			   System.out.println("sorted in descending order");
		   }
		   
		   
	   }

	}


