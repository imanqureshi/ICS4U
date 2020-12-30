package unitTwo;

import java.util.Scanner;

/**
 * Date: Oct 22 2020 
 * Name: Iman Qureshi 
 * ICS4U 
 * This program is made to allow user to receive an allowance of $10. 
 * User is able ask for money from parent and spend money. Allowance 
 * is only granted if users balance is over $10. Allowance cannot
 * be given more than 10 times.
 */
public class Allowance {
	public static void main(String[] args) {
		// variable declaration
		Parent p1 = new Parent(100);
		Child c1 = new Child();
		int choice;
		double withdraw;
		Scanner input = new Scanner(System.in);

		// input
		System.out.println("Please enter name of Child:");
		c1.name = input.nextLine();
		System.out.println(c1.toString());
		// formatting
		System.out.println("---------------------------");

		// starter allowance
		System.out.println("You've received allowance!");
		c1.money += 10;
		p1.money -= 10;
		System.out.println(c1.toString());

		// menu display
		System.out.println("(1) = Ask parent for Money\n(2) = Spend money");
		choice = input.nextInt();
		// condition while parent gives less than 10 allowances AND child still has
		// money
		while (p1.money != 0.01 && c1.money != 0.01) {
			if (choice == 1) {
				// condition if parent has not given allowance 10 times.
				if (p1.money != 0) {
					if (c1.money >= 10) {
						c1.money += 10;
						p1.money -= 10;
						System.out.println("Money received: $10");
						// condition if child has less than $10
					} else if (c1.money < 10) {
						System.out.println("You have been denied allowance.");
					}
					// condition if parent has given allowance 10 times.
				} else {
					System.out.println("You have been given max allowance.");
				}
			} else if (choice == 2) {
				System.out.println("How much would you like to spend?");
				withdraw = input.nextDouble();
				//condition if withdraw amount is less than child's balance. Successful withdraw. 
				if (withdraw < c1.money) {
					c1.money -= withdraw;
					System.out.println("Money spent!");
				//condition if withdraw amount if greater than child's balance. Unsuccessful withdraw.
				} else if (withdraw > c1.money) {
					System.out.println("Sorry, you do not have enough money to spend.");
				}
			//condition if user enters an invalid option number
			} else {
				System.out.println("Please enter a valid number");
			}
			//displays child info and options while condition is still true.
			System.out.println(c1.toString());
			System.out.println("(1) = Ask parent for Money\n(2) = Spend money");
			choice = input.nextInt();
		}
		// condition if max allowance from parent is reached and child runs out of money
		if (p1.money < 0.01 && c1.money < 0.01) {
			System.out.println("You are all out of money.");
		}
		input.close();
	}
}
