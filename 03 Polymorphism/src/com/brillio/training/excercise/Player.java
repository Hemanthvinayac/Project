package com.brillio.training.excercise;

public abstract class Player {

	private String firstName;
	private String lastName;
	
	public Player() {
	}

	public Player(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName(){
		return firstName+" "+lastName;
	}
	
	abstract int getRating();
}
