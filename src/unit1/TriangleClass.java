package unit1;

import java.util.Scanner;

//declare class Triangle
class Triangle {
	double side1;
	double side2;
	double side3;

//constructor 
	public Triangle() {
		side1 = 0;
		side2 = 0;
		side3 = 0;
	}

//constructor overload
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

//method to check if the sides of the triangle form a valid triangle
	public boolean isValid(double side1, double side2, double side3) {
		if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
			return (true);
		} else {
			return (false);
		}
	}

//method to check if the triangle is valid and equilateral.
	public boolean isEquilateral() {
		if (isValid(side1, side2, side3) == true) {
			if (side1 == side2 && side1 == side3)
				return true;
		} else {
			return false;
		}
		return false;
	}

	// method to check if the triangle is valid and isosceles.
	public boolean isIsosceles() {
		if (isValid(side1, side2, side3) == true) {
			if ((side1 == side2) && (side1 != side3) || (side1 == side3) && (side1 != side2)
					|| (side2 == side3) && (side2 != side1))
				return (true);
		} else {
			return (false);
		}
		return false;
	}
	// method toString to override methods
	public String toString() {
		String info = new String();
		info = "Side 1: " + this.side1 + "\nSide 2: " + this.side2 + "\nSide 3: " + this.side3;
		return (info);
				
	}
}

public class TriangleClass {
	public static void main(String[] args) {
		// variables
		Triangle t1 = new Triangle();
		Scanner scanner = new Scanner(System.in);
		// input
		System.out.println("Please enter side 1:");
		t1.side1 = scanner.nextDouble();

		System.out.println("Please enter side 2:");
		t1.side2 = scanner.nextDouble();

		System.out.println("Please enter side 3:");
		t1.side3 = scanner.nextDouble();

		scanner.close();
		
		// process and output
		System.out.println(t1.toString());
		
		if (t1.isValid(t1.side1, t1.side2, t1.side3) == true) {
			System.out.println("The trangle exists.");
		} else {
			System.out.println("The triangle does not exist.");
		}
		if (t1.isEquilateral() == true) {
			System.out.println("The triangle is equilateral.");
		} else if (t1.isIsosceles() == true) {
			System.out.println("The triangle is isosceles.");
		}
	}
}
