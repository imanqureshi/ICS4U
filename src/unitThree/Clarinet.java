package unitThree;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program is designed to define a clarinet woodwind instrument.
 */
public class Clarinet extends WoodWind {
	/**
	 * constructor
	 * pre: none
	 * post: clarinet instrument is created with player of instrument's name set to name.
	 */
	public Clarinet(String name) {
		super(name);
	}
	/**
	 * returns clarinet sound
	 * pre: none
	 * post: clarinet sound is returned.
	 */
	public String makeSound() {
		return "Squak";
	}
	/**
	 * returns clarinet information
	 * pre: none
	 * post: name and sound of clarinet artst is returned in formatted way. 
	 */
	public String toString() {
		String info;
		info = super.getMusician() + " makes a  " + makeSound() + " sound.";
		return info;
	}
}
