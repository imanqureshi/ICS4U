package Test;

/**
 * He, Jasikumar, Mendoza, Qureshi, Rincon
 * ICS4U
 * Nov 2, 2020
 * Program calculates the perimeter and area of 2 rectangles
*/

import java.util.*;
import java.lang.Math;

/**
 * He, Jasikumar, Mendoza, Qureshi, Rincon
 * ICS4U
 * Nov 2, 2020
 * Program calculates the perimeter and area of 2 rectangles
*/

import java.util.*;
import java.lang.Math;

class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle[] rect = new Rectangle[2];
		// Variable declaration
		int userInput = 0, overx = 0, overy = 0;

		lineBreak();
		System.out.print("We are going to make 2 rectangles." + "\n1. If you want to input the dimensions"
				+ "\n2. If you would like the computer to create the rectangles.");
		do {
			System.out.print("\nEnter your Choice: ");
			userInput = input.nextInt();
		} while (userInput != 1 && userInput != 2);

		lineBreak();
		// User inputs dimensions
		for (int i = 0; i < rect.length; i++) {
			rect[i] = new Rectangle();
			if (userInput == 1) {
				System.out.println("Rectangle: " + (i + 1));
				dimension(i, rect);

			}
			// Randomly generated dimensions
			else if (userInput == 2) {
				randomDimension(i, rect);
			}
		}

		// Checks where overlap exists in x and y directions.
		overx = rect[0].Overlap(rect[0].getTempX(), rect[1].getTempX(), rect[0].getLength(), rect[1].getLength());
		overy = rect[1].Overlap(rect[0].getTempY(), rect[1].getTempY(), rect[0].getHeight(), rect[1].getHeight());

		if (rect[0].SpaceCheck(rect[0].getTempX(), rect[1].getTempX(), rect[0].getLength(), rect[1].getLength(),
				rect[0].getTempY(), rect[1].getTempY(), rect[0].getHeight(), rect[1].getHeight()) == false) {
			overx = 0;
			overy = 0;
		}

		// Displays rectangle information
		System.out.println("Rectangle 1 Info:" + rect[0].toString());
		System.out.println("\nRectangle 2 Info:" + rect[1].toString());

		lineBreak();

		if (overx == 0 && overy == 0) {
			System.out.println("These Rectangles DO NOT overlap.");
		} else {
			System.out.println(
					"These Rectangles DO overlap.\nDimensions of overlapping rectangle: " + overx + "x" + overy);
			System.out.println("The total area is: " + rect[0].areaIfOverlap(rect[1], overx, overy));
			System.out.println("The total perimeter is: " + rect[0].perimeterIfOverlap(rect[1], overx, overy));
		}
		lineBreak();
	}

	/**
	 * User inputs the dimensions and starting coordinate of rectangle pre: none
	 * post: dimensions and starting coordinate is set.
	 */
	public static void dimension(int n, Rectangle[] r) {
		Scanner input = new Scanner(System.in);
		int corner;

		System.out.print("Which corner would you like to set." + "\n1. Bottom Left" + "\n2. Bottom Right"
				+ "\n3. Top Left" + "\n4. Top Right");
		do {
			System.out.print("\nEnter your Choice: ");
			corner = input.nextInt();
		} while (corner != 1 && corner != 2 && corner != 3 && corner != 4);

		System.out.print("Enter the x value of corner for Rectangle " + (n + 1) + ": ");
		r[n].setXCoor(input.nextInt());
		System.out.print("Enter the y value of corner for Rectangle " + (n + 1) + ": ");
		r[n].setYCoor(input.nextInt());

		System.out.println("Enter the dimensions of the rectangle: ");
		do {
			System.out.print("Length: ");
			r[n].setLength(input.nextInt());
		} while (r[n].getLength() <= 0);
		do {
			System.out.print("Height: ");
			r[n].setHeight(input.nextInt());
		} while (r[n].getHeight() <= 0);
		System.out.println();
		lineBreak();

		r[n].tempX(r[n].findLeftCornerX(corner, r[n].getXCoor(), r[n].getLength()));
		r[n].tempY(r[n].findLeftCornerY(corner, r[n].getYCoor(), r[n].getHeight()));
	}

	/**
	 * Generate dimensions for each rectangle randomly pre: none post: dimensions
	 * and starting coordinate is set.
	 */
	public static void randomDimension(int n, Rectangle[] r) {
		Random rnd = new Random();
		r[n].setXCoor(rnd.nextInt(100) - 100); // Random int num is generated between 0-100.
		r[n].setYCoor(rnd.nextInt(100) - 100);
		r[n].setLength(rnd.nextInt(100));
		r[n].setHeight(rnd.nextInt(100));
	}

	/**
	 * Prints a line break to divide parts of the program pre: none post: prints a
	 * series of asterisks and enters a new line
	 */
	public static void lineBreak() {
		System.out.println("\n*********************************************************************\n");
	}
}