package comm.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	private static Suit suit;
	private static Rank rank;
private static List<Card> protoDeck= new ArrayList<Card>();

static {
	for(Suit s: suit.values()) {
		 for(Rank r: rank.values()) {
			 protoDeck.add(new Card(s,r));
		 }
	}
	System.out.println(protoDeck);
}

public static void main(String[] args) {
	
}
}
