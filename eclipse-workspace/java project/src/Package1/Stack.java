package Package1;

import java.util.Stack;

class Stack1{
	private int top;
	private int arr[];
	private int capacity;
	
	public Stack1(int size) {
	 super();
	 stack= new Stack1();
	 
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("stack overflow");
		}
		else {
			System.out.println("inserting =" +item);
			top++;
		}
	}
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack underflow");
		}
		else {
			System.out.println();
			
		}
	}

}
