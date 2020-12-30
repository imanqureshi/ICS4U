package unitThree;

public class Car extends Vehicle {
	private int seats;
	private boolean isSedan;
	
	public Car(String n, String c, String m, int s) {
		super(n,c,m);
		seats = s;
		isSedan = false;
	}

	String drive() {
		return null;
	}

	String slowDown() {
		return null;
	}
	String Stop() {
		return null;
	}

	
}
