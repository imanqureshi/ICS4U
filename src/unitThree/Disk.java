package unitThree;

/**
 * Iman Qureshi 
 * ICS4U 
 * Nov 8 2020
 * This program creates a disk and its properties by inheriting existing properties from a circle.
 */
public class Disk extends Circle {
	private double thickness;
	/**
	 * constructor 
	 * pre: none 
	 * post: Disk is created with a radius or r and thickness of t
	 */
	public Disk(double r, double t) {
		super(r);
		thickness = t;
	}
	public Disk() {
		super();
		thickness = 1;
	}
	/**
	 * sets thickness of disk 
	 * pre: none. 
	 * post: disk thickness is set
	 */
	public void setThickness(double t) {
		thickness = t;
	}
	/**
	 * returns thickness of disk 
	 * pre: none. 
	 * post: thickness of disk is returned
	 */
	public double getThickness() {
		return thickness;
	}
	/**
	 * calculates volume of disk 
	 * pre: none. 
	 * post: volume of disk is calculated
	 */
	public double volume() {
		double volume;
		volume = super.area() * thickness;
		return (volume);
	}
	/**
	 * compares disks by values of radius and thickness
	 * pre: none. 
	 * post: if radius and thickness are the same, returns true. else, returns false. 
	 */
	public boolean equals(Object a) {
		Disk d = (Disk) a;
		if (super.getRadius() == d.getRadius() && thickness == d.thickness) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * displays info about disk 
	 * pre: none. 
	 * post: info about disk is displayed. 
	 */
	public String toString() {
		String info;
		info = "Disk Radius: " + super.getRadius() + "\nDisk Thickness: " + thickness;
		return (info);
	}
}
