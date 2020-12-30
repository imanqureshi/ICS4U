package Test;

import java.util.Scanner;

public class Car {
	String model;
	int year;
	double cost;

	public Car() {
	}

	public Car(String m, int y, double c) {
		this.model = m;
		this.year = y;
		this.cost = c;
	}

	public boolean setModel(String model) {
		if (model.equalsIgnoreCase("Sedan") || model.equalsIgnoreCase("SUV") || model.equalsIgnoreCase("Coupe")
				|| model.equalsIgnoreCase("Van") || model.equalsIgnoreCase("Pickup") || model.equalsIgnoreCase("Micro")
				|| model.equalsIgnoreCase("Supercar")) {
			this.model = model;
			return true;
		} else
			return false;
	}

	public boolean setYear(int year) {
		if (year <= 2020) {
			this.year = year;
			return true;
		} else
			return false;
	}

	public boolean setCost(double cost) {
		if (cost > 0) {
			this.cost = cost;
			return true;
		} else
			return false;
	}

	public String toString() {
		String info = new String();
		info = "Information about Car:";
		info += "\nModel: " + this.model;
		info += "\nYear: " + this.year;
		info += "\nInitial Cost: $" + this.cost;
		return (info);
	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Scanner input = new Scanner(System.in);
		int choice;
		String carModel;
		int carYear;
		double carCost;

		System.out.println("CAR APPLICATION\n(1) = Make a Standard Car\n(2) = Create Custom Car");
		choice = input.nextInt();

		if (choice == 1) {
			c1.model = "Sedan";
			c1.year = 2020;
			c1.cost = 20000;
		} else if (choice == 2) {
			System.out.println("Creating Custom Car...\n");

			System.out.println("Please enter car model:\n1. Sedan\n2. SUV\n3. Coupe\n4. "
					+ "Van\n5. Pickup\n6. Micro\n7. Supercar\nEnter your Choice:");
			carModel = input.next();
			while (c1.setModel(carModel) == false) {
				System.out.println("Please enter valid car model:");
				carModel = input.next();
			}
			if (c1.setModel(carModel) == true) {
				c1.model = carModel;
			}

			System.out.println("Please enter car year:");
			carYear = input.nextInt();
			while (c1.setYear(carYear) == false) {
				System.out.println("Please enter a valid year:");
				carYear = input.nextInt();
			}
			if (c1.setYear(carYear) == true) {
				c1.year = carYear;
			}
			System.out.println("Please enter car's price:");
			carCost = input.nextDouble();
			while (c1.setCost(carCost) == false) {
				System.out.println("Please enter a valid price:");
				carCost = input.nextDouble();
			}
			if (c1.setCost(carCost) == true) {
				c1.model = carModel;
			}
		}
		System.out.println(c1.toString());

		input.close();
	}
}
