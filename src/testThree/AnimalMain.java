package testThree;

import java.util.Random;
import java.util.Scanner;

public class AnimalMain {

	public static Animal assignAnimal() {
		int num;
		boolean isFriendly;
		String endangeredStatus;
		String colour;
		String country;
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int x = rand.nextInt(4) + 1;
		String name;
		int age;

		System.out.println("Please enter Animal's Name: ");
		name = input.next();

		System.out.println("Please enter Animal's Age");
		age = input.nextInt();

		if (x == 1) {
			System.out.println("A Wild Animal has Been Created!\n");
			num = rand.nextInt(2);
			if (num == 0) {
				endangeredStatus = "Yes";
			} else {
				endangeredStatus = "No";
			}
			return new Wild(name, age, endangeredStatus);
		} else if (x == 2) {
			System.out.println("Creating Pet Object...\n");
			System.out.println("Please enter Pet's country: ");
			country = input.next();
			System.out.println("A Pet has Been Created!\n");
			return new Pet(name, age, country);
		} else if (x == 3) {
			System.out.println("Creating Cat Object...\n");
			System.out.println("Please enter Cat's country: ");
			country = input.next();
			num = rand.nextInt(2);
			if (num == 0) {
				isFriendly = true;
			} else if (num == 1) {
				isFriendly = false;
			} else {
				isFriendly = true;
			}
			System.out.println("A Cat has Been Created!\n");
			return new Cat(name, age, country, isFriendly);

		} else if (x == 4) {
			System.out.println("Creating Dog Object...\n");
			System.out.println("Please enter Dog's country: ");
			country = input.next();
			num = rand.nextInt(3);
			if (num == 0) {
				colour = "Brown";
			} else if (num == 1) {
				colour = "White";
			} else {
				colour = "Black";
			}
			System.out.println("A Dog has Been Created!\n");
			return new Dog(name, age, country, colour);
		} else {
			return new Pet("Mark", 5, "Canada");
		}
	}

	public static void main(String[] args) {
		Animal[] mapleZoo = new Animal[10];
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("**********MAPLE ZOO********\n");
		for (int i = 0; i < mapleZoo.length; i++) {
			System.out.println("\nAnimal: " + (i + 1) + "/10\n");
			mapleZoo[i] = assignAnimal();
		}
		for (int i = 0; i < mapleZoo.length; i++) {
			System.out.println("\nAnimal: " + (i + 1) + "/10\n");
			System.out.println(mapleZoo[i].toString());
		}
	}

}
