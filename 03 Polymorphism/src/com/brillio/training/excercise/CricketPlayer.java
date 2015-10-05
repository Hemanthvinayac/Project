package com.brillio.training.excercise;

public class CricketPlayer extends Player {

	private double averageRuns;
	
	public CricketPlayer() {
	}
	
	public CricketPlayer(String firstName, String lastName, double averageRuns) {
		super(firstName, lastName);
		this.averageRuns = averageRuns;
	}

	@Override
	int getRating() {
		 if (averageRuns > 70){
			 return 5;
		 }else if(averageRuns > 55){
			 return 4;
		 }else if(averageRuns > 35){
			 return 3;
		 }else if(averageRuns > 20){
			 return 2;
		 }else if(averageRuns <=20){
			 return 1;
		 }

		return 0;
	}

}
