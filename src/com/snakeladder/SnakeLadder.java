package com.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {

		// variables
		final int NoPlay = 0;
		final int Ladder = 1;
		final int Snake = 2;
		int PlayerPostion1 = 0;// initial position of player
		int PlayerPostion2 = 0;
		int count = 0;
		boolean Player = true;

		// loop till player reach the winning spot which is 100
		while (PlayerPostion1 < 100 && PlayerPostion2 < 100) {

			int CurrentPlayerPostion = Player ? PlayerPostion1 : PlayerPostion2;

			// dice number generator
			int die = (int) (Math.random() * 6) + 1;
			count++;// counting the number of times dice was played

			// turn is for player
			System.out.println("Turn: " + (Player ? "Player 1" : "Player 2"));

			System.out.println("The Dice Number is :" + die);

			// option Number generator
			int option = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("Genrat Random Postion :" + option);

			if (option == 1) {
				if (CurrentPlayerPostion <= 100 && (CurrentPlayerPostion + die <= 100))
					CurrentPlayerPostion = CurrentPlayerPostion + die;
				System.out.println("Your status is Ladder");

			}

			else if (option == 2) {
				// In case the player position moves below 0, then the player restarts from 0
				if (CurrentPlayerPostion > 0 && (CurrentPlayerPostion - die) >= 0) {
					CurrentPlayerPostion = CurrentPlayerPostion - die;
					System.out.println(" Your status is Snake");

				}
			}

			else {
				System.out.println("Your Status is No Play ");
			}
			// cheaking current postion player
			System.out.println("Current Position: " + CurrentPlayerPostion);
			if (Player)
				PlayerPostion1 = CurrentPlayerPostion;
			else
				PlayerPostion2 = CurrentPlayerPostion;

			if (option != Ladder)
				Player = !Player;

		}
		// count how many times dice will Rotate starting to end
		System.out.println("Total number of times dice is played :" + count);

		// checking who has won
		System.out.println(PlayerPostion1 >= 100 ? "Player 1 Won" : "Player 2 Won");
	}

}
