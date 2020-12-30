package unitThree;
/**
 * Iman Qureshi
 * ICS4U1
 * Nov 11 2020
 * This program is designed to define cybal percussion instruments.
 *
 */
public class Cymbal extends Percussion {
	/**
	 * constructor
	 * pre: none
	 * post: cymbal instrument is created with player name set to name.
	 */
	public Cymbal(String name) {
		super(name);
	}
	/**
	 * makes cymbal instruments sound
	 * pre: none
	 * post: returns sound of cymbal instrument
	 */
	public String makeSound() {
		return "Crashk";
	}
	/**
	 * displays type of percussion movement needed for cymbal
	 * pre: none
	 * post: movement type is displayed.
	 */
	public String type() {
		return "Hit";
	}
}
