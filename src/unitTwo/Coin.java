package unitTwo;

import java.util.Arrays;
import java.util.Random;
/**
 * Date: Oct 21 2020
 * Name: Iman Qureshi
 * ICS4U1
 * This application displays the faces on four coins 
 * which are chosen randomly by computer. 
 */
public class Coin {
	// coin attributes
	String face;

	// constructor
	public Coin() {
		Random rand = new Random();
		int coin;
		coin = rand.nextInt(2) + 1;
		if (coin == 1) {
			this.face = "Heads";
		} else
			this.face = "Tails";
	}

	/*method toString to print information about coin
	 * pre: none
	 * post: information about coin is printed*/
	public String toString() {
		String info = new String();
		info = this.face;
		return (info);
	}

	public static void main(String[] args) {
		// declare variables
		Coin[] c1 = new Coin[4];
		// initializing each coin
		for (int i = 0; i < c1.length; i++) {
			c1[i] = new Coin();
		}
		System.out.println("COIN FACES:\n" + Arrays.toString(c1));
	}
}
