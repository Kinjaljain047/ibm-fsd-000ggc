package com.example;

public class Bird extends Flyer{
	@Override
	public void takeoff() {

		System.out.println("bird take off");
	}

	@Override
	public void fly() {
		System.out.println("bird fly");
		
	}

	@Override
	public void land() {
		
		System.out.println("bird land");
	}
	

}
