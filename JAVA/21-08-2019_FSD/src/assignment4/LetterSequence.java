package assignment4;

import java.util.Map;
import java.util.TreeMap;

public class LetterSequence {
 private String sentence;
private int count=0;
public LetterSequence() {
	super();
}

public LetterSequence(String sentence) {
	super();
	this.sentence = sentence;
}
 public TreeMap<Character,Integer> countFrequency(String sentence){
	 TreeMap<Character, Integer> tcount= new TreeMap<Character, Integer>();
	 char[] strArray = sentence.toCharArray();
	 for (char c : strArray) { 
         if (tcount.containsKey(c)) {
             tcount.put(c, tcount.get(c) + 1); 
         } 
         else {  
             tcount.put(c, 1); 
         } 
     } 

     /*
     for (Map.Entry entry : tcount.entrySet()) { 
         System.out.println(entry.getKey() + " " + entry.getValue()); 
     } */
     return tcount;
	 
 }
 
 public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap) {
	 
	 for (Map.Entry entry : frequencyMap.entrySet()) { 
		 count=(int) entry.getValue();
         System.out.print(entry.getKey() + " " );
         for(int i=0;i<count;i++) {
        	 System.out.print("*");
         }
         System.out.println();
            } 
	 
 }
}
