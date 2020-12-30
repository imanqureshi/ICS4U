package unitThree;
/**
 * Iman Qureshi
 * ICS4U1
 * Nov 11 2020
 * This program is designed to define drum percussion instruments.
 *
 */
public class Drum extends Percussion {
	/**
	 * constructor
	 * pre: none
	 * post: drum instrument is created with player name set to name.
	 */
	public Drum(String name) {
		super(name);
	}
	/**
	 * makes drum sound
	 * pre: none
	 * post: returns sound of drums
	 */
	public String makeSound() {
		return "Crashk";
	}
	/**
	 * displays type of percussion movement needed for drums.
	 * pre: none
	 * post: movement type is displayed.
	 */
	public String type() {
		return "DrumStick";
	}

}
