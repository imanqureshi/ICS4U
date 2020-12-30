package unitThree;
/**
 * Iman Qureshi 
 * ICS4U 
 * Nov 6 2020
 * This program creates and compares pucks. 
 */
public class Hockey {
	public static void main(String[] args) {
		Puck p1 = new Puck(5.0);
		Puck p2 = new Puck(4.0);
		
		System.out.println(p1);
		System.out.println("\n" + p2);
		
		System.out.println("\nPuck Face Area: " + p1.area());
		System.out.println("Puck Volume: " + p1.volume());

		if (p1.equals(p2)) {
			System.out.println("\nPucks are the same.");
		} else {
			System.out.println("Pucks are not the same.");
		}
	}
}
