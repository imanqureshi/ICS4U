package unitThree;
/**
 * Iman Qureshi
 * ICS4U
 * Nov 8 2020
 * This program creates a rectangle and its properties and behaviors. 
 */
public class Box extends Rectangle {
	private double depth;
	private String colour;
	/**
	 * constructor
	 * pre: none. 
	 * post: length, width, and depth are set to l and w and d. 
	 */
	public Box(double l, double w, double d) {
		super(l, w);
		depth = d;
		colour = "White";
	}
	/**
	 * constructor overload
	 * pre: none. 
	 * post: depth is set to d
	 */
	public Box(double d) {
		super();
		depth = d;
		colour = "White";
	}
	/**
	 * constructor overload
	 * pre: none. 
	 * post: depth is set to default value of 3. colour remains default "white".
	 */
	public Box() {
		super();
		depth = 3;
		colour = "White";
	}
	/**
	 * sets box colour 
	 * pre: none. 
	 * post: box colour is set to c
	 */
	public void setColour(String c) {
		if (c.equalsIgnoreCase("Black") || c.equalsIgnoreCase("Brown") || c.equalsIgnoreCase("Red")
				|| c.equalsIgnoreCase("Orange") || c.equalsIgnoreCase("Yellow") || c.equalsIgnoreCase("Green")
				|| c.equalsIgnoreCase("Blue") || c.equalsIgnoreCase("Purple")) {
			colour = c;
		} else {
			colour = "White";
		}
	}
	/**
	 * returns box colour
	 * pre: none. 
	 * post: colour of box is returned
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * calculates and returns volume
	 * pre: none. 
	 * post: volume of box is returned
	 */
	public double Volume() {
		double volume;
		volume = super.area() * depth;
		return volume;
	}
	/**
	 * calculates and returns SA
	 * pre: none. 
	 * post: SA of box is returned
	 */
	public double SurfaceArea() {
		double SA;
		SA = 2 * (super.area() + depth * super.getLength() + depth * super.getWidth());
		return (SA);
	}

	/**
	 * compares boxes 
	 * pre: none. 
	 * post: if boxes have same length, width, colour, and depth, returns true. else, returns false.
	 */
	public boolean equals(Object a) {
		Box b = (Box) a;
		if (colour == b.colour && depth == b.depth && super.getLength() == b.getLength()
				&& super.getWidth() == b.getWidth()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * displays info about box 
	 * pre: none. 
	 * post: info about box is displayed
	 */
	public String toString() {
		String info;
		info = "Information about Box\n*********************\n";
		info += "Length of Box: " + super.getLength() + "\nWidth of Box: " + super.getWidth() + "\nDepth of Box: "
				+ depth + "\nBox Colour: " + colour + "\nVolume: " + Volume() + "\nSurface Area: "
				+ SurfaceArea();
		return (info);
	}
}
