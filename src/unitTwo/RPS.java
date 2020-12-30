package unitTwo;

import java.util.Random;
import java.util.Scanner;

/**
 * Date: Oct 20 2020 
 * Name: Iman Qureshi 
 * ICS4U1 
 * This program runs a Rock Paper Scissors game until user decides 
 * to quit program. User is able to play as a standard player or 
 * create a player. For every user win 2 points are added to users 
 * score. For every loss, a point is deducted. Draws do not impact user
 * points.
 */
public class RPS {
	public static void main(String[] args) {
		// declare variables
		Player p1 = new Player();
		final int ROCK = 1;
		final int PAPER = 2;
		final int SCISSORS = 3;
		int playerMove;
		int compMove;
		int choice;
		Random rand = new Random();
		Scanner input = new Scanner(System.in);

		//menu display
		System.out.println("ROCK PAPER SCISSORS!\n" 
				+ "(1) = Play as standard player\n" 
				+ "(2) = Create Player\n"
				+ "Enter your choice number:");
		// input
		choice = input.nextInt();

		// process and output of Player choice
		if (choice == 1) {
			p1.name = "Standard Player";
		} else if (choice == 2) {
			System.out.println("Enter Player Name:");
			p1.name = input.next();
		} else {
			System.out.println("Not a valid option.");
		}
		System.out.println(p1.toString());

		System.out.println("\nPlease enter your choice:\n" 
				+ "(1) = ROCK\n" 
				+ "(2) = PAPER\n" 
				+ "(3) = SCISSORS\n"
				+ "Enter 0 to Quit");
		playerMove = input.nextInt();
		// application continues to run and loops until user decides to stop.
		while (playerMove != 0) {
			// generates computer moves with an integer between 1-3 for the choices.
			compMove = rand.nextInt(3) + 1;
		
			// condition where result is a draw
			if (playerMove == ROCK && compMove == ROCK || playerMove == PAPER && compMove == PAPER
					|| playerMove == SCISSORS && compMove == SCISSORS) {
				System.out.println("Its a draw!");
			}
			// condition where result is a loss for the user. A point is deducted for user
			if (playerMove == ROCK && compMove == PAPER || playerMove == PAPER && compMove == SCISSORS
					|| playerMove == SCISSORS && compMove == ROCK) {
				System.out.println("You lose!");
				if (p1.points > 0) {
					p1.points -= 1;
				}
			}
			// condition where result is a win for the user. 2 Points are gained for user
			if (playerMove == ROCK && compMove == SCISSORS || playerMove == PAPER && compMove == ROCK
					|| playerMove == SCISSORS && compMove == PAPER) {
				System.out.println("You win!");
				p1.points += 2;
			}
			//condition where user inputs a number other than option values
			if (playerMove > 3 || playerMove < 1) {
				System.out.println("Please enter a valid choice.");
			}
			//display's user points at the end of every round. user is prompted to make another choice
			System.out.println("Points: " + p1.points);
			System.out.println("\nPlease enter your choice:\n" + "(1) = ROCK\n" + "(2) = PAPER\n" + "(3) = SCISSORS\n"
					+ "Enter 0 to Quit");
			playerMove = input.nextInt();
		}
		//condition to exit application
		if (playerMove == 0) {
			System.out.println("Thanks for playing " + p1.name + "! Here are your results:");
			System.out.println(p1.toString());
		}
		input.close();
	}
}
