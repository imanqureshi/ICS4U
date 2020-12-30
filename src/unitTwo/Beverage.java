package unitTwo;

import java.util.Random;
import java.util.Scanner;
/**
 * Oct 25 2020 
 * Iman Qureshi 
 * ICS4U
 * This program allows a user to order from 3 drinks of 3 different sizes and 
 * random cost until the user decides to quit. The program is able to display 
 * the total num of drinks ordered and total cost.
 */
public class Beverage {
	//class attributes
	private String name; // instance variable declaration
	private String size;
	private double cost;
	private static double totalCost = 0; // class variable declaration
	private static int quantity = 0;
	Random rand = new Random();
	/**
	 * constructor
	 * pre: none
	 * post: Beverage is created with name passed in from n, default size small, and randomly generated cost between
	 * $3.00 to $6.00.
	 */
	public Beverage(String n) { // constructor
		name = n;
		size = "Small";
		cost = (double)(rand.nextInt(300) + 300)/100;
	}
	/**
	 * constructor overload
	 * pre: none
	 * post: Beverage is created with name, size, and cost passed in from n, s, and c.
	 */
	public Beverage(String n, String s, double c) { 
		name = n;
		size = s;
		cost = c;
	}
	/**
	 * sets name for beverage
	 * pre: none
	 * post: name is set
	 */
	public void setName(String n) {
		name = n;
	}
	/**
	 * returns beverage name
	 * pre: none
	 * post: beverage name is returned
	 */
	public String getName() {
		return name;
	}
	/**
	 * sets size for beverage
	 * pre: none
	 * post: size is set
	 */
	public void setSize(String s) {
		if (size == "Small" || size == "Medium" || size == "Large") {
			size = s;
			if (size == "Medium") {
				cost = cost*1.5;
			} else if (size == "Large") {
				cost = cost*1.9;
			}
		} else {
			size = "Small";
		}
	}
	/**
	 * returns beverage size
	 * pre: none
	 * post: beverage size is returned
	 */
	public String getSize() {
		return size;
	}
	/**
	 * returns beverage cost
	 * pre: none
	 * post: beverage cost is returned
	 */
	public void setCost(double c) {
		cost = c;
	}
	public double getCost() {
		return cost;
	}
	/**
	 * adds total cost of beverages
	 * pre: none
	 * post: cost is added to running total.  
	 */
	public void addTotalCost(double c) {
		totalCost += c;
	}
	/**
	 * returns total cost of beverages
	 * pre: none
	 * post: total beverage cost is returned
	 */
	public double getTotalCost() {
		return totalCost;
	}
	/**
	 * prints information about beverage
	 * pre: none
	 * post: information about beverage is displayed
	 */
	public String toString() {
		String info;
		info = "\nBeverage Name: " + name;
		info += "\nSize: " + size;
		info += "\nCost: $" + cost;
		return (info);
	}
	/**
	 * displays beverage menu with beverage options
	 * pre: none
	 * post: beverage name is displayed
	 */
	public static void displayMenu() {
		System.out.println("BEVERAGE MENU");
		System.out.println("-------------");
		System.out.println("1. Berry Blasters");
		System.out.println("2. Cherry Bomber");
		System.out.println("3. Mango Magic");
		System.out.println("4. Checkout");
		System.out.println("\nEnter your choice:");
	}

	public static void main(String[] args) {
		//variable declaration
		Beverage[] beverages = new Beverage[9];
		int choice, var = 0;
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			beverages[i] = new Beverage("Berry Blasters");	//initialization of 1st drink 
		}
		beverages[1].setSize("Medium");
		beverages[2].setSize("Large");

		for (int i = 3; i < 6; i++) {
			beverages[i] = new Beverage("Cherry Bomber");	//initialization of 2nd drink 
		}
		beverages[4].setSize("Medium");
		beverages[5].setSize("Large");
		
		for (int i = 6; i < 9; i++) {
			beverages[i] = new Beverage("Mango Magic");		//initialization of 3rd drink 
		}
		beverages[7].setSize("Medium");
		beverages[8].setSize("Large");
		
		//input
		displayMenu();
		choice = input.nextInt();
		//process and output
		while (choice != 4) {			//condition while user does not checkout. 
			if (choice == 1) {
				System.out.println("\nSIZE SELECTION\n");
				System.out.println("1. Small. $" + beverages[0].getCost() + "\n2. Medium. $" + beverages[1].getCost()
						+ "\n3. Large. $" + beverages[2].getCost() + "\nEnter your choice: ");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println(beverages[0].toString());
					var = 0;
				} else if (choice == 2) {
					System.out.println(beverages[1].toString());
					var = 1;
				} else if (choice == 3) {
					System.out.println(beverages[2].toString());
					var = 2;
				}
			} else if (choice == 2) {
				System.out.println("1. Small. $" + beverages[3].getCost() + "\n2. Medium. $" + beverages[4].getCost()
						+ "\n3. Large. $" + beverages[5].getCost() + "\nEnter your choice: ");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println(beverages[3].toString());
					var = 3;
				} else if (choice == 2) {
					System.out.println(beverages[4].toString());
					var = 4;
				} else if (choice == 3) {
					System.out.println(beverages[5].toString());
					var = 5;
				}
			} else if (choice == 3) {
				System.out.println("1. Small. $" + beverages[6].getCost() + "\n2. Medium. $" + beverages[7].getCost()
						+ "\n3. Large. $" + beverages[8].getCost() + "\nEnter your choice: ");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println(beverages[6].toString());
					var = 6;
				} else if (choice == 2) {
					System.out.println(beverages[7].toString());
					var = 7;
				} else if (choice == 3) {
					System.out.println(beverages[8].toString());
					var = 8;
				}
			} else {
				System.out.println("Please enter a valid Choice");
			}
			beverages[0].addTotalCost(beverages[var].getCost());
			System.out.println("\n********** Added to Cart! ***********");
			System.out.println("*************************************\n");
			quantity++;															//increases quantity every round in while loop
			displayMenu();
			choice = input.nextInt();
		}
		//condition once user decides to checkout. 
		if (choice == 4) {
			System.out.println("\n***********************************\n");
			System.out.println("Beverages Ordered: " + quantity);
			System.out.println("Total Cost: $" + totalCost);
			System.out.println("\n***********************************\n");
			System.out.println("Thank you for shopping at Iman's Boomin' Beverage Shop!");
		}
		input.close();
	}
}
