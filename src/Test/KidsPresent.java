package Test;

import java.util.Random;

public class KidsPresent extends Present {
	private int age;

	public KidsPresent(String contents, int theAge) {
		super(contents);
		age = theAge;
	}

	public int getAge() {
		return (age);
	}

	public String toString() {
		return (super.toString() + " for a child age " + getAge());
	}
	public String description() {
		String info;
		int num;
		Random rand = new Random();
		num = rand.nextInt(3) + 1;
		if (num == 1) {
			info = (getContents() + " is a great toy!");
		} else if (num == 2) {
			info = (getContents() + " is an okay toy!");
		} else {
			info = (getContents() + " is a bad toy!");
		} 
		return info;
	}
}
