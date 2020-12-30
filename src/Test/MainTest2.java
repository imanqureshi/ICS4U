package Test;

import java.util.Scanner;

public class MainTest2 {

	public static Alpha assignObj() {
		int choice;
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("\n1. Create a Beta Object\n2. Create a Gemma Object\n\nEnter your choice:");
		choice = input.nextInt();
		if (choice == 1) {
			System.out.println("Please assign an integer for your object: ");
			num = input.nextInt();
			return new Beta(num);
		} else if (choice == 2) {
			System.out.println("Please assign an integer for your object: ");
			num = input.nextInt();
			return new Gemma(num);
		} else 
			return new Beta(5);
	}

	public static void main(String[] args) {
		Beta[] b = new Beta[10];
		int num;
		Scanner input = new Scanner(System.in);
		Beta betaRef = new Beta(6);
//		Alpha[] a = new Alpha[10];
//
//		for (int i = 0; i < a.length; i++) {
//			System.out.println("\nObject " + (i+1) + "/10");
//			a[i] = assignObj();
//			System.out.println(a[i].display());
//		}
		for (int i = 0; i < b.length; i++) {
			System.out.println("Enter integer value for Beta: " + (i+1));
			num = input.nextInt();
			b[i] = new Beta(num);
		}
		
		for (int i = 0; i < b.length; i++) {
			if (b[i].equals(betaRef)) {
				System.out.println("Beta: " + (i+1) + " and reference Beta are the same instance of the Beta Class");
			} 
		}
		System.out.println("\nIf nothing is displayed, none of the Beta values are the same instance as reference Beta");
	}
}
