package com.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {

		// variables
		final int NoPlay = 0;
		final int Ladder = 1;
		final int Snake = 2;
		int PlayerPostion = 0; // initial position of player

		// loop till player reach the winning spot which is 100
		while (PlayerPostion < 100) {

			// dice number generator
			int die = (int) (Math.random() * 6) + 1;
			System.out.println("The Dice Number is :" + die);

			// option Number generator
			int option = (int) Math.floor(Math.random() * 10) % 3;
			System.out.println("Genrat Random Postion :" + option);

			if (option == 1) {
				if (PlayerPostion <= 100 && (PlayerPostion + die <= 100))
					PlayerPostion = PlayerPostion + die;
				System.out.println("Your status is Ladder");

				// printing position of player
				System.out.println("Your Postion is :" + PlayerPostion);
			}

			else if (option == 2) {
				// In case the player position moves below 0, then the player restarts from 0
				if (PlayerPostion > 0 && (PlayerPostion - die) >= 0) {
					PlayerPostion = PlayerPostion - die;
					System.out.println(" Your status is Snake");
					System.out.println("Your Postion is :" + PlayerPostion);
				}
			}

			else {
				System.out.println("Your Status is No Play ");
				System.out.println("Your Postion is :" + PlayerPostion);
			}
		}
	}

}
