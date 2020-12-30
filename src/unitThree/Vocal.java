package unitThree;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program is designed to define a vocal instrument.
 */
public class Vocal extends Instrument {
	/**
	 * constructor
	 * pre: none
	 * post: vocal instrument is created with Singer name set to singerName.
	 */
	public Vocal(String singerName) {
		super(singerName);
	}
	/**
	 * returns vocalist's sound
	 * pre: none
	 * post: vocalist's sound is returned.
	 */
	public String makeSound() {
		return "LaLaLa";
	}
	/**
	 * returns information about singer 
	 * pre: none
	 * post: Singers name and sounds is returned in legible way. 
	 */
	public String toString() {
		String info;
		info = super.getMusician() + " makes a  " + makeSound() + " sound.";
		return info;
	}
}
