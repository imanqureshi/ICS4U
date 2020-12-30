package unitThree;
/**
 * Iman Qureshi
 * Nov 11 2020
 * ICS4U
 * This program is designed to run a performance that can be a solo, duet, or a trio. 
 */
public class Performance {
	String arrangement;				//class attributes
	Instrument solo, duet, trio;
	
	/**
	 * constructor
	 * pre: none
	 * post: a solo performance is created for the instrument inst.
	 */
	Performance (Instrument inst) {
		solo = inst;
		arrangement = solo.makeSound();
	}
	/**
	 * constructor overload
	 * pre: none
	 * post: a duet performance is created for the instruments inst1 and inst2.
	 */
	Performance (Instrument inst1, Instrument
	inst2) {
		solo = inst1;
		duet = inst2;
		arrangement = solo.makeSound() + duet.makeSound();
	}
	/**
	 * constructor
	 * pre: none
	 * post: a trio performance is created for the instruments inst1, inst2, and inst3.
	 */
	Performance (Instrument inst1, Instrument
	inst2, Instrument inst3) {
		solo = inst1;
		duet = inst2;
		trio = inst3;
		arrangement = solo.makeSound() + duet.makeSound() + trio.makeSound();
	}
	/**
	 * displays sounds in arrangment in performance. 
	 * pre: none
	 * post: sound of arrangment is displayed. 
	 */
	public void begin() {
		System.out.println(arrangement);
	}
	/**
	 * performance information
	 * pre: none
	 * post: returns information about the arrangement of sounds included in the performance. 
	 */
	public String toString() {
		String info;
		info = "The performance includes the following sounds: " + arrangement;
		return info;
		
	}
	
}
