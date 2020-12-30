package testThree;

public class Wild extends Animal {
	private String endangeredStatus;

	public Wild(String newName, int newAge, String endangeredStat) {
		super(newName, newAge);
		endangeredStatus = endangeredStat;
	}

	public String getEndangeredStatus() {
		return endangeredStatus;
	}

	public void setEndangeredStatus(String endangeredStatus) {
		this.endangeredStatus = endangeredStatus;
	}

	public String playWith() {
		if (getEndangeredStatus() == "No") {
			return "Plays with Food";
		} else {
			return "Does not play with anything";
		}
	}

	public String toString() {
		return "WILD ANIMAL INFO\n********\n" + super.toString() + "\nEndangered?: " + endangeredStatus;
	}

}
