package com.snakeladder;

public class SnakeLadder {

	public static void main(String[] args) {
		// variables
		final int NoPlay = 0;
		final int Ladder = 1;
		final int Snake = 2;
		int PlayerPostion = 0;

		// dice number generator
		int die = (int) (Math.random() * 6) + 1;
		System.out.println("The Dice Number is :" + die);

		// option Number generator
		int option = (int) Math.floor(Math.random() * 10) % 3;

		if (option == 1) {
			PlayerPostion = PlayerPostion + die;
			System.out.println("Your status is Ladder");
			System.out.println("Your Postion is :" + PlayerPostion);
		} else if (option == 2) {

			PlayerPostion = PlayerPostion - die;
			System.out.println(" Your status is Snake");
			System.out.println("Your Postion is :" + PlayerPostion);

		} else {
			System.out.println("Your Status is No Play :");
			System.out.println("Your Postion is :" + PlayerPostion);
		}
	}

}
