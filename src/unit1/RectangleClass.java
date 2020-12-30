package unit1;

import java.util.Scanner;

//declare class Rectangle
class Rectangle {
	double length;
	double width;

	// constructor
	public Rectangle() {
		length = 0;
		width = 0;
	}

	// constructor overload
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}

	// method to calculate area.
	public double area() {
		return length * width;
	}

	// method to calculate perimeter.
	public double perimeter() {
		return 2 * (length + width);
	}

	// method to check if rectangle is square.
	public boolean isSquare(double l, double w) {
		if (l == w) {
			return true;
		} else
			return false;
	}
	// method toString to override methods
	public String toString() {
		String info = new String();
		info = "Length: " + this.length + "\nWidth: " + this.width;
		return (info);
	}
}
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
