package testThree;

public class Dog extends Pet {
	private String colour;

	public Dog(String newName, int newAge, String c, String col) {
		super(newName, newAge, c);
		colour = col;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String toString() {
		return "DOG INFO\n********\n" + super.toString() + "\nColour = " + colour;
	}

}
