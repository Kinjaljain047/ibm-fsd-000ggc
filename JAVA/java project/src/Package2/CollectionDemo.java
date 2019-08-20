package Package2;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;

public class CollectionDemo {
static Scanner sc= new Scanner(System.in);
	private String str[];
	private Set<String> set;
	public CollectionDemo() {
		System.out.println("number of elements in the array:");
		str = new String[sc.nextInt()];
		for(int i=0;i<str.length;i++) {
			System.out.println("name:");
			str[i]= sc.next().toString();
		}
		set= new HashSet<String>();
		for(String s: str) {
			if(!set.add(s)) {
				System.out.println("duplicate element found not added in the list");
			}
		}
	}
	public void displayCollection() {
		for(String ss : set) {
			System.out.println(ss.toString());
		
		
		}
	}
	
	
}
