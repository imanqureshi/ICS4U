package unitThree;
/**
 * Iman Qureshi 
 * ICS4U
 * Nov 11 2020
 * This program is designed to define an instrument.
 *
 */
public abstract class Instrument {
	private String musician;	//class attribute
	
	/**
	 * constructor
	 * pre: none
	 * post: Instrument is created with musician name set to name.
	 */
	public Instrument(String name) {
		musician = name;
	}
	/**
	 * returns musician name
	 * pre: none
	 * post: musician name is returned. 
	 */
	public String getMusician() {
		return musician;
	}
	/**
	 * defines the sound behaviour all instruments have.
	 */
	abstract String makeSound();
}
