package unit1;

import java.util.Scanner;

//declare class PiggyBank
class PiggyBank {
	int penny;
	int nickel;
	int dime;
	int quarter;

	// constructor
	public PiggyBank() {
		penny = 0;
		nickel = 0;
		dime = 0;
		quarter = 0;
	}

	// constructor overload
	public PiggyBank(int pennies, int nickels, int dimes, int quarters) {
		penny = pennies;
		nickel = nickels;
		dime = dimes;
		quarter = quarters;
	}

	/**
	 * method to add a number of pennies to the bank 
	 * pre: user must input num of pennies to add 
	 * post: num of pennies are added to bank.
	 */
	public void AddPenny(int numberOfPenniesToAdd) {
		penny += numberOfPenniesToAdd;
		System.out.println("You have " + penny + " pennies/penny.\n");
	}

	/**
	 * method to add a number of nickels to the bank 
	 * pre: user must input num of nickels to add 
	 * post: num of nickels are added to bank.
	 */
	public void AddNickel(int numberOfNickelsToAdd) {
		nickel += numberOfNickelsToAdd;
		System.out.println("You have " + nickel + " nickel(s).\n");
	}

	/**
	 * method to add a number of dimes to the bank 
	 * pre: user must input num of dimes to add 
	 * post: num of dimes are added to bank.
	 */
	public void AddDime(int numberOfDimesToAdd) {
		dime += numberOfDimesToAdd;
		System.out.println("You have " + dime + " dime(s).\n");
	}

	/**
	 * method to add a number of quarters to the bank. 
	 * pre: user must input num of quarters to add 
	 * post: num of quarters are added to bank.
	 */
	public void AddQuarter(int numberOfQuartersToAdd) {
		quarter += numberOfQuartersToAdd;
		System.out.println("You have " + quarter + " quarter(s).\n");
	}

	/**
	 * method to show total amount in bank 
	 * pre: none. 
	 * post: total value of each coin and value of bank is displayed.
	 */
	public void ShowAmount() {
		double total;
		total = (penny * 0.01) + (nickel * 0.05) + (dime * 0.1) + (quarter * 0.25);

		System.out.println("Value of Pennies: $" + String.format("%.2f", penny * 0.01));
		System.out.println("Value of Nickels: $" + String.format("%.2f", nickel * 0.05));
		System.out.println("Value of Dimes: $" + String.format("%.2f", dime * 0.1));
		System.out.println("Value of Quarters: $" + String.format("%.2f", quarter * 0.25));
		System.out.println("Total Amount in Bank: $" + String.format("%.2f", total));
	}
/**
 * method that returns true if user's withdraw amount is able to be withdrawn form bank. 
 * pre: user must input withdraw amount.
 * post: returns true if there are enough coins to withdraw amount.
 * reduces min num of coins form bank.
 */
	public boolean Withdraw(double amount) {

		// base condition (all money in account)
		if (amount > ((penny * 0.01) + (nickel * 0.05) + (dime * 0.10) + (quarter * 0.25))) {
			return false;
		}
		// need these variables to keep track of the number
		// of each coin we are using. This is because
		// there is a chance that we do not have the sufficient change
		// to return the desired amount, and so subtracting from our piggy
		// bank in this case would be incorrect. We keep track of the
		// the number of each coin and then subtract those numbers before
		// we return TRUE to the user.
		int numOfQuarters = 0;
		int numOfDimes = 0;
		int numOfNickels = 0;
		int numOfPennies = 0;

		if (amount >= 0.25 && quarter > 0) {
			numOfQuarters = (int) (amount / 0.25);
			if (numOfQuarters > quarter) {
				numOfQuarters = quarter;
			}
			amount -= (numOfQuarters * 0.25);
		}

		if (amount >= 0.10 && dime > 0) {
			numOfDimes = (int) (amount / 0.10);
			if (numOfDimes > dime) {
				numOfDimes = dime;
			}
			amount -= (numOfDimes * 0.10);
		}

		if (amount >= 0.05 && nickel > 0) {
			numOfNickels = (int) (amount / 0.05);
			if (numOfNickels > nickel) {
				numOfNickels = nickel;
			}
			amount -= (numOfNickels * 0.05);
		}

		if (amount >= 0.01 && penny > 0) {
			numOfPennies = (int) (amount / 0.01);
			if (numOfPennies > penny) {
				numOfPennies = penny;
			}
			amount -= (numOfPennies * 0.01);
		}

		if (amount < 0.01 && amount > 0) {
			amount = 0;
			numOfPennies++;
		}

		if (amount == 0) {
			// subtract from out piggy bank before returning.
			this.quarter -= numOfQuarters;
			this.dime -= numOfDimes;
			this.nickel -= numOfNickels;
			this.penny -= numOfPennies;
			return true;
		} else {
			return false;
		}
	}
}

/**
 * MySavings program is displayed and run. 
 * pre: none 
 * post: program is displayed and run.
 */
public class MySavings {
	public static void main(String[] args) {
		// variables
		PiggyBank bank = new PiggyBank();
		int choice;
		int num;
		double amount;
		Scanner input = new Scanner(System.in);

		// input
		displayMenu();
		choice = input.nextInt();

		// process and output
		while (choice != 0) {
			if (choice == 1) {
				System.out.println("Enter how many pennies:");
				num = input.nextInt();
				bank.AddPenny(num);

			} else if (choice == 2) {
				System.out.println("Enter how many nickels:");
				num = input.nextInt();
				bank.AddNickel(num);

			} else if (choice == 3) {
				System.out.println("Enter how many dimes:");
				num = input.nextInt();
				bank.AddDime(num);

			} else if (choice == 4) {
				System.out.println("Enter how many quarters:");
				num = input.nextInt();
				bank.AddQuarter(num);

			} else if (choice == 5) {
				System.out.println("How much would you like to withdraw?");
				amount = input.nextDouble();
				if (bank.Withdraw(amount) == true) {
					System.out.println("Successful withdrawl");
				} else {
					System.out.println("You do not have enough coins to withdraw $" + amount);
				}
			} else if (choice == 6) {
				bank.ShowAmount();

			} else {
				System.out.println("Not a valid option.\n");
			}
			displayMenu();
			choice = input.nextInt();
		}
		if (choice == 0) {
			System.out.println("You have now quit the program.");
			input.close();
		}

	}

	/**
	 * method to display the MySavings menu 
	 * pre: none 
	 * post: menu is displayed.
	 */
	public static void displayMenu() {
		System.out.println("---------------");
		System.out.println("YOUR PIGGY BANK");
		System.out.println("---------------\n");
		System.out.println("1. Add pennies.\n" + "2. Add nickels.\n" + "3. Add dimes.\n" + "4. Add quarters.\n"
				+ "5. Take money out of the bank.\n" + "6. Show Total in the bank.\n" + "7. Enter 0 to quit.\n\n"
				+ "Enter your choice:");
	}
}