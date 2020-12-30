package testThree;

import java.util.Random;

public class Pet extends Animal {
	private String country;

	public Pet(String newName, int newAge, String newCountry) {
		super(newName, newAge);
		country = newCountry;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String playWith() {
		int num;
		Random rand = new Random();
		num = rand.nextInt(2) + 1;
		if (num == 1) {
			return "Plays with Bone";
		} else
			return "Plays with Rubber Ducky";
	}

	public String toString() {
		return "-- Pet Info --\n" + super.toString() + "\nCountry = " + country;
	}

}
