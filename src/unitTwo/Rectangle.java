package unitTwo;

import java.util.Random;

public class Rectangle {
	double length;
	double width;
	String colour;

	// constructor
	public Rectangle() {
		Random rand = new Random();
		length = rand.nextInt(10) + 1;
		width = rand.nextInt(10) + 1;
		int c;
		c = rand.nextInt(3) + 1;
		if (c == 1) {
			colour = "Red";
		}
		if (c == 2) {
			colour = "Blue";
		}
		if (c == 3) {
			colour = "Green";
		}
	}

	// constructor overload
	public Rectangle(double l, double w, String c) {
		length = l;
		width = w;
		colour = c;
	}

	/**
	 * sets length of Rectangle 
	 * pre: number must be passed in. 
	 * post: length is set.
	 */
	public void setLength(double l) {
		length = l;
	}

	/**
	 * gets length of Rectangle 
	 * pre: none 
	 * post: length is returned.
	 */
	public double getLength() {
		return length;
	}

	/**
	 * sets width of Rectangle 
	 * pre: number must be passed in. 
	 * post: width is set.
	 */
	public void setWidth(double w) {
		width = w;
	}

	/**
	 * gets width of Rectangle 
	 * pre: none 
	 * post: width is returned.
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * sets colour of Rectangle 
	 * pre: String must be passed in. 
	 * post: colour is set.
	 */
	public void setColour(String c) {
		colour = c;
	}

	/**
	 * gets colour of Rectangle 
	 * pre: none 
	 * post: colour is returned.
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * method to calculate area. 
	 * pre: length and width must exist 
	 * post: returns area
	 */
	public double area() {
		return length * width;
	}

	/**
	 * method to calculate perimeter. 
	 * pre: length and width must exist 
	 * post:perimeter is returned.
	 */
	public double perimeter() {
		return 2 * (length + width);
	}

	/**
	 * method to check if rectangle is square.
	 * pre: length and width must exist
	 * post:true is returned is rectangle is square. else, false.
	 */
	public boolean isSquare(double l, double w) {
		if (l == w) {
			return true;
		} else
			return false;
	}

	/**
	 * prints characteristics about rectangle. 
	 * pre: none 
	 * post:information about rectangle is displayed
	 */
	public String toString() {
		String info = new String();
		info = "\nLength: " + length + "\nWidth: " + width + "\nColour: " + colour;
		info += "\nArea: " + area();
		info += "\nPerimeter: " + perimeter();
		if (isSquare(length, width) == true) {
			info += "\nRectangle is a square.";
		} else {
			info += "\nRectangle is not a square.";
		}
		return (info);
	}

	/**
	 * compares rectangles by length, width, and colour 
	 * pre: two rectangles must exist. 
	 * post: returns true if dimensions AND colour are the same. if else, returns false.
	 */
	public boolean equals(Object a) {
		Rectangle r = (Rectangle) a;
		if (length == r.length && width == r.width && colour.equals(r.colour)
				|| length == r.width && width == r.length && colour.equals(r.colour)) {
			return (true);
		} else
			return (false);
	}

	public static void main(String[] args) {
		// variable declaration
		Rectangle[] r1 = new Rectangle[10];

		// initializing every rectangle within array
		for (int i = 0; i < r1.length; i++) {
			r1[i] = new Rectangle();
		}
		System.out.println("Generating 10 Random Rectangles...\n");
		// process and output
		for (int i = 0; i < r1.length; i++) {
			for (int j = i + 1; j < r1.length; j++) {
				if (r1[i].equals(r1[j]) == true) {
					System.out.println("\nRectangle " + (i + 1) + " and Rectangle " + (j + 1) + " are the same!");
					System.out.println("\nRectangle " + (i + 1) + ":" + r1[i].toString());
					System.out.println("\nRectangle " + (j + 1) + ":" + r1[j].toString());
				}
			}
		}
		System.out.println("\nIf no Rectangles are displayed, none of the rectangles are the same!");
		System.out.println("Thank you. Goodbye!");

	}
}
