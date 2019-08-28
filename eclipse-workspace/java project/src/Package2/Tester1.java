package Package2;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;
import java.util.InputMismatchException;

import static java.lang.System.err;

public class Tester1 {
	private static Scanner sc= new Scanner(in);
	public static void main(String[] args) {
	String name= null;
	try {
		out.println("coach name:");
		name= sc.next();
		TennisCoach myCoach= new TennisCoach();
		myCoach.createCoach(name, Level.Medium);
		out.println(myCoach.getCoachDetails().toString());
	}catch(InputMismatchException e){
		e.printStackTrace();
		err.println(e.toString());
		
	}
	}

}
