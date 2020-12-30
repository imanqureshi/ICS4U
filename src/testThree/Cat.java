package testThree;

public class Cat extends Pet {
	private boolean isFriendly;

	public Cat (String newName, int newAge, String c, boolean isFriendly) {
		super (newName, newAge, c);
		this.isFriendly = isFriendly;
		
	}
	
	public boolean getIsFriendly() {
		return isFriendly;
	}

	public void setFriendly(boolean isFriendly) {
		this.isFriendly = isFriendly;
	}

	public String playWith() {
		if (isFriendly && getAge() < 7) {
			return "Plays with Yarn";	
		} else {
			return "Does not play with anything";
		}
	}
	
	public String toString() {
		return "CAT INFO\n********\n" + super.toString() + "\nCat is Friendly: " + isFriendly;
	}
	
}
