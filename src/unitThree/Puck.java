package unitThree;
/**
 * Iman Qureshi 
 * ICS4U 
 * Nov 8 2020
 * This program creates a puck and its properties by inheriting existing properties from a disk.
 */
public class Puck extends Disk {
	private double weight;
	private boolean standard = false;
	private boolean youth = false;
	/**
	 * constructor
	 * pre: none. 
	 * post: puck is created with default radius of 1.5, thickness of 1, and weight of w. 
	 */
	public Puck(double w) {
		super(1.5, 1);
		weight = w;
		if (weight >= 5 && weight <= 5.5) {
			standard = true;
		} else if (weight >= 4 && weight <= 4.5){
			youth = true;
		}
	}
	/**
	 * sets weight of puck
	 * pre: none. 
	 * post: weight of puck is set.
	 */
	public void setWeight(double w) {
		if (w <= 5.5 && w > 0) {
			weight = w;
		} else if (w > 5.5) {
			weight = 5.5;
		} else {
			weight = 4;
		}
	}
	/**
	 * returns weight of puck
	 * pre: none. 
	 * post: weight of puck is returned
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * returns information about division type of puck. 
	 * pre: none. 
	 * post: division type of puck is returned. 
	 */
	public String getDivision() {
		String type;
		if (standard) {
			type = "\nPuck Size: Standard";
		} else if (youth) {
			type = "\nPuck Size: Youth";
		} else {
			type = "Not a Valid Puck Size";
		}
		return (type);
	}
	/**
	 * compares pucks based on division and weight. 
	 * pre: none. 
	 * post: if pucks is in the same division and weigh the same, returns true. else, returns false.
	 */
	public boolean equals(Object a) {
		Puck p = (Puck) a;
		if (getDivision() == p.getDivision() && weight == p.weight) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * returns info about puck
	 * pre: none. 
	 * post: info about puck is displayed 
	 */
	public String toString() {
		String info;
		info = "Puck Diameter (inches): " + super.getRadius()*2 + "\nPuck Thickness (inches): " + super.getThickness()
				+ "\nPuck Weight (ounces): " + weight + getDivision();
		return (info);
	}
}
