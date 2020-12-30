package sortTest;

import java.util.Random;

/**
 * Iman Qureshi
 * Dec 16 2020
 * ICS4U
 * This program creates Tshirt objects and assigns required properties to the object. 
 */
public class tShirt {
	private String colour;
	private int size;
	private boolean design;
	/**
	 * constructor
	 * pre: none
	 * post: initializes t shirt object
	 */
	public tShirt() {
		Random rand = new Random();
		int num; 
		num = rand.nextInt(4);
		if (num == 1) {
			colour = "Red";
		} else if (num == 2) {
			colour = "Blue";
		} else if (num == 3) {
			colour = "Green";
		} else {
			colour = "Yellow";
		}
		num = rand.nextInt(2);
		if (num == 1) {
			design = true;
		} else {
			design = false;
		}
		num = rand.nextInt(5) + 28;
		size = num;
	}
	/**
	 * constructor overload
	 * pre: none
	 * post: initializes tShirt object to inputted values
	 */
	public tShirt(String c, int s, boolean d) {
		colour = c;
		size = s;
		design = d;
	}
	/**
	 * returns colour of shirt
	 * pre: none
	 * post: colour is returned
	 */
	public String getColour() {
		return colour;
	}
	/**
	 * sets colour to an inputted string
	 * pre: none
	 * post: colour is set. 
	 */
	public void setColour(String c) {
		colour = c;
	}
	/**
	 * randomly assigns colour to the tshirt
	 * pre: none
	 * post: colour is set at random to either red, blue, green, or yellow
	 */
	public String randColour() {
		Random rand = new Random();
		int num; 
		num = rand.nextInt(4);
		if (num == 1) {
			colour = "Red";
		} else if (num == 2) {
			colour = "Blue";
		} else if (num == 3) {
			colour = "Green";
		} else {
			colour = "Yellow";
		}
		return colour;
	}
	/**
	 * returns the size of the shirt
	 * pre: none
	 * post: size is returned. 
	 */
	public int getSize() {
		return size;
	}
	/**
	 * size is set to inputed number
	 * pre: none
	 * post: size of t shirt is set. 
	 */

	public void setSize(int s) {
		size = s;
	}
	/**
	 * sets size randomly between 28 to 32
	 * pre: none
	 * post: size is set randomly
	 */
	public int randSize() {
		Random rand = new Random();
		int num;
		num = rand.nextInt(5) + 28;
		size = num;
		return size;
	}
	/**
	 * returns whether or not there is a design on the shirt
	 * pre: none
	 * post: returns whether or not there is a design on the shirt. 
	 */
	public boolean isDesign() {
		return design;
	}
	/**
	 * sets design to an inputed boolean 
	 * pre: none
	 * post: design is set
	 */
	public void setDesign(boolean d) {
		design = d;
	}
	/**
	 * sets design variable randomly to either true or false
	 * pre: none
	 * post: design is set to true or false randomly
	 */
	public boolean randDesign() {
		Random rand = new Random();
		int num;
		num = rand.nextInt(2);
		if (num == 1) {
			design = true;
		} else {
			design = false;
		}
		return design;
	}
	public String toString() {
		String info;
		info = "\n**TSHIRT INFO**";
		info += "\nColour: " + colour;
		info += "\nSize: " + size;
		if (design) {
			info += "\nDesign: Yes";
		} else {
			info+= "\nDesign: No";
		}
		return info;
	}
	
}
