package unitTwo;

import java.util.Scanner;

public class RectangleClass {
	public static void main(String[] args) {
		// variables
		Rectangle r1 = new Rectangle();
		Scanner scanner = new Scanner(System.in);

		// input
		System.out.println("Please enter the length of rectangle:");
		r1.length = scanner.nextDouble();

		System.out.println("Please enter the width of rectangle:");
		r1.width = scanner.nextDouble();

		scanner.close();

		// process and output
		System.out.println(r1.toString());

		System.out.println("The area of the rectangle is: " + r1.area());

		System.out.println("The perimeter of the rectangle is: " + r1.perimeter());

		if (r1.isSquare(r1.length, r1.width) == true) {
			System.out.println("The rectangle is a square.");
		} else {
			System.out.println("The rectangle is not a square.");
		}
	}
}
