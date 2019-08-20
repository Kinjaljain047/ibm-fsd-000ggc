package com.example;

public class Tester{
	public static void main(String[] args) {
		Flyer flyer= new Bird();
		flyer.takeoff();
		flyer= new SuperMan();
		flyer.takeoff();
	}
	
}
