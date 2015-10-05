package com.brillio.training.excercise;

public class Program {

	public static void main(String[] args) {
		Player[] players = new Player[10];
		players[0] = new CricketPlayer("Hemanth","Vinay",70);
		players[1] = new CricketPlayer("Vinay","Kumar",60);
		players[2] = new CricketPlayer("Tom","Cruise",35);
		players[3] = new CricketPlayer("Ram","Gopal",12);
		players[4] = new CricketPlayer("Shailesh","sakhare",90);
		players[5] = new FootBallPlayer("Rakesh","V",32);
		players[6] = new FootBallPlayer("Deepu","P",12);
		players[7] = new FootBallPlayer("Guru","Raj",4);
		players[8] = new FootBallPlayer("Praveen","B G",1);
		players[9] = new FootBallPlayer("Harish","K",17);
		
		for (Player player : players) {
			System.out.println(player.getName()+", "+ player.getClass().getSimpleName() +" "+"Rating :("+player.getRating()+")");
		}
		
	}
}
