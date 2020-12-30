package unitThree;

import java.util.Scanner;
/**
 * Iman Qureshi
 * ICS4U
 * Nov 8 2020
 * This program creates a box and tests its ability to inherit from the Rectangle class
 * It also creates a pencil case that identifies an appropriate age group for pencil case. 
 */
public class BoxMain {
	public static void main(String[] args) {
		Box b1 = new Box(2,2,5);
		b1.setColour("Red");
		PencilCase pc1 = new PencilCase();
		Scanner input = new Scanner(System.in);
		
		System.out.println(b1.toString());
		System.out.println("Area of Box Top: " + b1.area()); //calls on rectangle class
		
		System.out.println("\n***********************************\n");
		
		System.out.println("Please enter a colour for your pencil case:");
		pc1.setColour(input.next());
		
		System.out.println("Please enter an age group:");
		pc1.setAgeGroup(input.nextInt());
		
		System.out.println(pc1);
		
		input.close();
	}
}
