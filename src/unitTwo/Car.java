package unitTwo;

import java.util.Scanner;

/**
 * Date: Oct 25 2020 
 * Name: Iman Qureshi 
 * ICS4U1 
 * This program runs a car application that allows users to make a standard or custom car 10 times.
 */
public class Car {
	//variable declaration
	private String name;
	private String model;
	private int year;
	private double cost = 0;
	private static double averageCost = 0;
	
	//constructor
	public Car() {
	}
	//constructor overload
	public Car(String n, String m, int y, double c) {
		this.name = n;
		this.model = m;
		this.year = y;
		this.cost = c;
	}
	/**
	 * sets name of car
	 * pre: name must be passed in
	 * post: name of car is set. 
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * sets model of car
	 * pre: valid model must be passed in
	 * post: model of car is set. 
	 */
	public void setModel(String model) {
		if (model.equalsIgnoreCase("Sedan") || model.equalsIgnoreCase("SUV") || model.equalsIgnoreCase("Coupe")
				|| model.equalsIgnoreCase("Van") || model.equalsIgnoreCase("Pickup") || model.equalsIgnoreCase("Micro")
				|| model.equalsIgnoreCase("Supercar")) {
			this.model = model;
		}
	}
	/**
	 * sets year of car
	 * pre: integer under or equal to 2020 must be passed in
	 * post: year of car is set. 
	 */
	public void setYear(int year) {
		if (year <= 2020) {
			this.year = year;
		}
	}
	/**
	 * sets cost of car
	 * pre: integer over 0 must be passed in 
	 * post: cost of car is set. 
	 */
	public void setCost(double cost) {
		if (cost > 0) {
			this.cost = cost;
		}
	}
	/**
	 * returns the name of the car
	 * pre: none.
	 * post: name of car is returned. 
	 */
	public String getName() {
		return name;
	}
	/**
	 * returns the model of the car
	 * pre: none.
	 * post: model of car is returned. 
	 */
	public String getModel() {
		return model;
	}
	/**
	 * returns the model of the car
	 * pre: none.
	 * post: model of car is returned. 
	 */
	public int getYear() {
		return year;
	}
	/**
	 * returns the cost of the car
	 * pre: none.
	 * post: cost of car is returned. 
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * adds the total cost of all cars in array
	 * pre: none.
	 * post: total cost of car is calculated. 
	 */
	public void addTotalCost(double cost) {
		averageCost += cost;
	}
	/**
	 * returns average cost
	 * pre: none.
	 * post: average cost of cars is calculated and returned. 
	 */
	public static double getAverageCost() {
		return averageCost/ 10;
	}
	/**
	 * displays information about the car
	 * pre: none.
	 * post: tcar information is displayed
	 */
	public String toString() {
		String info = new String();
		info = "Information about Car:";
		info += "\nName: " + getName();
		info += "\nModel: " + getModel();
		info += "\nYear: " + getYear();
		info += "\nInitial Cost: $" + getCost();
		return (info);
	}
	/**
	 * displays an options menu
	 * pre: none.
	 * post: options menu in displayed
	 */
	public static void optionsMenu() {
		System.out.println("\nOPTIONS MENU");
		System.out.println("1) Update Car Information");
		System.out.println("2) List all Car Names.");
		System.out.println("3) List all the current costs of each car and the average cost.");
		System.out.println("4) Exit Program");
		System.out.println("\nEnter your choice:");
	}

	public static void main(String[] args) {
		//variable declaration
		Car[] c1 = new Car[10];
		Scanner input = new Scanner(System.in);
		int choice;
		int carNum;

		for (int i = 0; i < c1.length; i++) {
			c1[i] = new Car();			//initializing each car in array. 
		}
		//input
		System.out.println("CAR APPLICATION\n");
		for (int i = 0; i < c1.length; i++) {
			System.out.println("\nCreating Car Number: " + (i + 1) + "/10\n"
					+ "(1) = Make a Standard Car\n(2) = Create Custom Car");
			choice = input.nextInt();
			if (choice == 1) {
				//standard car creation
				c1[i].setName("Invisible BoatMobile");
				c1[i].setModel("Sedan");
				c1[i].setYear(1999);
				c1[i].setCost(20000);
			} else if (choice == 2) {
				//custom car creation
				System.out.println("Creating Custom Car...\n");
				System.out.println("Please enter car model:\n1. Sedan\n2. SUV\n3. Coupe\n4. "
						+ "Van\n5. Pickup\n6. Micro\n7. Supercar\nEnter your Choice:");
				c1[i].setModel(input.next());
				System.out.println("Please enter car year:");
				c1[i].setYear(input.nextInt());
				System.out.println("Please enter car's price:");
				c1[i].setCost(input.nextDouble());
				System.out.println("Set a name for your car:");
				c1[i].setName(input.next());
			}
			System.out.println(c1[i].toString());
		}
		optionsMenu();
		choice = input.nextInt();
		//condition while user does not quit program
		while (choice != 4) {
			if (choice == 1) {
				//updating car information 
				System.out.println("Which car would you like to update?");
				carNum = input.nextInt();
				System.out.println("What would you like to update?\n1) Name\n2) Model\n3) Year \n4) Initial Price");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Renaming Car " + carNum + "...");
					System.out.println("Previous Name:" + c1[carNum - 1].getName());
					System.out.println("New Name:");
					c1[carNum - 1].setName(input.next());
				} else if (choice == 2) {
					System.out.println("Changing Model for Car " + carNum + "...");
					c1[carNum - 1].setModel(input.next());
				} else if (choice == 3) {
					System.out.println("Changing Year for Car " + carNum + "...");
					c1[carNum - 1].setYear(input.nextInt());
				} else if (choice == 4) {
					System.out.println("Changing Initial Price for Car " + carNum + "...");
					c1[carNum - 1].setCost(input.nextDouble());
				}
				System.out.println("Updated.\n" + c1[carNum - 1].toString());
			} else if (choice == 2) {
				//list of all car names
				System.out.println("Listing names of all Cars:");
				for (int i = 0; i < c1.length; i++) {
					System.out.println("Car Number " + (i + 1) + ":" + c1[i].getName());
				}
			} else if (choice == 3) {
				//list of current cost of all cars and total cost average of cars.
				System.out.println("Listing current cost of all Cars:");
				for (int i = 0; i < c1.length; i++) {
					System.out.println("Cost for Car " + (i + 1) + ":" + c1[i].getCost());
					c1[i].addTotalCost(c1[i].getCost());
				}
				System.out.println("Average Cost of all Cars:");
				System.out.println(getAverageCost());
			} else {
				System.out.println("Please enter a valid option.");
			}
			System.out.println("Complete!");
			optionsMenu();
			choice = input.nextInt();
		}
		if (choice == 4) {
			//condition once user decides to quit program through options menu
			System.out.println("Thank you. Goodbye.");
		}
		input.close();
	}
}
