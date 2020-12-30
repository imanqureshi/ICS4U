package unitThree;
/**
 * Iman Qureshi 
 * ICS4U 
 * Nov 8 2020
 * This program creates a circle and its properties.
 */
public class Circle {
	// class attributes
	private double radius;
	private static final double PI = 3.14;

	/**
	 * constructor 
	 * pre: none. 
	 * post: Circle object is created with radius set to 0.
	 */
	public Circle() {
		radius = 1;
	}

	/**
	 * constructor overload 
	 * pre: none. 
	 * post: Circle object is created with radius set to r.
	 */
	public Circle(double r) {
		radius = r;
	}

	/**
	 * sets circle radius 
	 * pre: none. 
	 * post: radius of circle is set to r
	 */
	public void setRadius(double r) {
		radius = r;
	}

	/**
	 * returns circle radius 
	 * pre: none. 
	 * post: circle radius is returned
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * calculate and returns circle area 
	 * pre: none. 
	 * post: circle area is returned
	 */
	public double area() {
		return radius * radius * PI;
	}

	/**
	 * calculates and returns circle circumference 
	 * pre: none. 
	 * post: circle circumference is returned
	 */
	public double circumference() {
		return 2 * PI * radius;
	}
	/**
	 * compares circles by radius
	 * pre: none. 
	 * post: returns true if radius values are equal
	 */
	public boolean equals(Object a) {
		Circle c = (Circle) a;
		if (radius == c.radius) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * displays information about circle 
	 * pre: none. 
	 * post: circle info is returned
	 */
	public String toString() {
		String info;
		info = "Circle Radius: " + radius;
		return (info);
	}
}
