package com.example;

public class Test {

	public static void main(String[]args) {
		Model model = new Line(0, 20);
		Model model1 = new Line(0,10);
		System.out.println(model.isGreater(model,model1));
		
	}
}
