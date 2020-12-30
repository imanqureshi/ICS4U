package unitThree;

/**
 * Iman Qureshi
 * ICS4U
 * Nov 8 2020
 * This program creates a rectangle and its properties and behaviors. 
 */
public class Rectangle {
	//class attributes
	private double length;
	private double width;

	/**
	 * constructor 
	 * pre: none. 
	 * post: Rectangle object is created with length and width set to 1.
	 */
	public Rectangle() {
		length = 1;
		width = 1;
	}

	/**
	 * constructor overload
	 * pre: none. 
	 * post: Rectangle object is created with length of l and width of w
	 */
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	/**
	 * sets length
	 * pre: none. 
	 * post: length is set to l
	 */
	public void setLength(double l) {
		length = l;
	}
	/**
	 * gets length 
	 * pre: none. 
	 * post: length is returned
	 */
	public double getLength() {
		return length;
	}
	/**
	 * sets width
	 * pre: none. 
	 * post: width is set to w
	 */
	public void setWidth(double w) {
		width = w;
	}
	/**
	 * width is returned
	 * pre: none. 
	 * post: width is returned
	 */
	public double getWidth() {
		return width;
	}
	/**
	 * calculates and returns area
	 * pre: none. 
	 * post: area is calculated and returned 
	 */
	public double area() {
		return length * width;
	}
	/**
	 * calculates and returns perimeter
	 * pre: none. 
	 * post: perimeter is calculated and returned 
	 */
	public double perimeter() {
		return 2 * (length + width);
	}

	/**
	 * checks if rectangle is a cube
	 * pre: none. 
	 * post: returns true if rectangle is a cube. else, returns false.
	 */
	public boolean isSquare(double l, double w) {
		if (l == w) {
			return true;
		} else
			return false;
	}
	/**
	 * compares rectangles
	 * pre: none. 
	 * post: if rectangles have same length and width, returns true. else, returns false. 
	 */
	public boolean equals(Object a) {
		Rectangle r = (Rectangle)a;
		if (length == r.length && width == r.width) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * displays info about rectangle
	 * pre: none. 
	 * post: info about rectangle is displayed
	 */
	public String toString() {
		String info = new String();
		info = "Length: " + length + "\nWidth: " + width;
		return (info);
	}
}
