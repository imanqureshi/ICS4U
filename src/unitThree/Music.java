package unitThree;

import java.util.Scanner;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program creates musical arrangements and runs a performance based on user preference.
 */
public class Music {
	/**
	 * sets instrument to an instance of the variable in the client code. 
	 * pre: none
	 * post: instrument is assigned a type and returned. 
	 */
	public static Instrument AssignInstrument() {
		int choice;				//method variables
		String name;
		Scanner input = new Scanner(System.in);

		System.out.println("Select Instrument: \n1. Vocals\n2. Clarinet\n3. Piccolo\n4. Cymbal\n5. Drum\n\n"); //input
		System.out.println("Enter your choice:");
		choice = input.nextInt();

		System.out.println("Enter Band Member Name: ");	//input
		name = input.next();

		if (choice == 1) {			//process and output
			return new Vocal(name);
		} else if (choice == 2) {
			return new Clarinet(name);
		} else if (choice == 3) {
			return new Piccolo(name);
		} else if (choice == 4) {
			return new Cymbal(name);
		} else if (choice == 5) {
			return new Drum(name);
		} else {
			return new Vocal(name);
		}
	}
	
	public static void main(String[] args) {
		Performance Band;	//variable declaration
		Instrument i1, i2, i3;
		Scanner input = new Scanner(System.in);
		int choice;

		System.out.println("Welcome to your Music Band!\n****************************");

		System.out.println("Instrument 1/3: \n");			//sets instrument variables in client code.
		i1 = AssignInstrument();
		System.out.println("\nInstrument 2/3: \n");
		i2 = AssignInstrument();
		System.out.println("\nInstrument 3/3: \n");
		i3 = AssignInstrument();

		System.out.println(i1 + "\n" + i2 + "\n" + i3);

		System.out.println("\n****************************");

		System.out.println("\n******Performance Option******");
		
			System.out.println("\n1. Listen to a Solo\n2. Listen to a Duet\n3. Listen to a Trio\n4. Quit\n");
			choice = input.nextInt();
		while (choice != 4) {
			if (choice == 1) {
				Band = new Performance(i1);
			} else if (choice == 2) {
				Band = new Performance(i1, i2);
			} else if (choice == 3) {
				Band = new Performance(i1, i2, i3);
			} else {
				Band = new Performance(i1, i2);
			}
			Band.begin();
			System.out.println("\n1. Listen to a Solo\n2. Listen to a Duet\n3. Listen to a Trio\n4. Quit\n");
			choice = input.nextInt();
		}
		if (choice == 4) {
			System.out.println("Thank you. Goodbye.");
		}
	}
}