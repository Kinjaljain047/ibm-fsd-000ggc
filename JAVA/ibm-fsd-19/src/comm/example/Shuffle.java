package comm.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Shuffle {
 public static void main(String[] args) {
	  int hand;
	  int cards;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter no of hands:");
	  hand=sc.nextInt();
	  System.out.println("Enter no of cards:");
	  String[] suit= new String[] {"spades", "hearts", "diamonds", "ace"};
	  String[] rank= new String[] {"ace","2","3","4","5","6","7", "8","9","jack","queen","king"};
	  List<String> str= new ArrayList<String>();
	  
	 
	   for
		   for(Suit s: Suit.values()) {
			   for(Rank r: Rank.values()) {
				   protoDeck.add(new Card(s,r));
			   }
		   }
		   System.out.println(protoDeck);
	   }
 }

