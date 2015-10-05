package com.brillio.training.excercise;

public class FootBallPlayer extends Player {
	
	private int goals;
	
	public FootBallPlayer() {
	}
	
	public FootBallPlayer(String firstName, String lastName, int goals) {
		super(firstName, lastName);
		this.goals = goals;
	}



	@Override
	int getRating() {
		 if(goals > 20){
			 return 5;
		 }else if(goals > 15){
			 return 4;
		 }else if(goals > 10){
			 return 3;
		 }else if(goals > 5){
			 return 2;
		 }else if(goals <=5){
			 return 1;
		 }
		return 0;
	}

}
