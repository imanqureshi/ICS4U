package unitThree;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program is designed to define Woodwind instruments. 
 */
abstract class WoodWind extends Instrument {
	/**
	 * constructor
	 * pre: none
	 * post: standard woodwind instrument is created with name of instrument player set to name. 
	 */
	public WoodWind(String name) {
		super(name);
	}
	/**
	 * returns woodwind instrument sound
	 * pre: none
	 * post: woodwind instrument sound is returned.
	 */
	public String makeSound() {
		return "toot";
	}
}
