package unitThree;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program is designed to define the Piccolo woodwind instrument.
 */
public class Piccolo extends WoodWind {
	/**
	 * constructor
	 * pre: none
	 * post: piccolo instrument is created with piccolo artist's name set to name.
	 */
	public Piccolo(String name) {
		super(name);
	}
	/**
	 * returns piccolo sound
	 * pre: none
	 * post: piccolo sound is returned.
	 */
	public String makeSound() {
		return "Peep";
	}
	/**
	 * returns information about piccolo artist.
	 * pre: none
	 * post: name and sound of piccolo artst is returned in formatted way. 
	 */
	public String toString() {
		String info;
		info = super.getMusician() + " makes a  " + makeSound() + " sound.";
		return info;
	}
}
