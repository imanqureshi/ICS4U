package unitThree;
/**
 * Iman Qureshi
 * ICS4U1
 * Nov 11 2020
 * This program is designed to define percussion instruments.
 *
 */
abstract class Percussion extends Instrument {
	/**
	 * constructor
	 * pre: none
	 * post: Percussion instrument is created with player name set to name.
	 */
	public Percussion(String name) {
		super(name);
	}
	/**
	 * makes default percussion instruments sound
	 * pre: none
	 * post: returns sound of defaul percussion instrument
	 */
	public String makeSound() {
		return "Crshk";
	}
	/**
	 * 
	 * defines the type of percussion behaviour all percussion instruments have.
	 *
	 */
	abstract String type(); 
}
