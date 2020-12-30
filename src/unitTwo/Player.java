package unitTwo;

public class Player {
	//variable declaration
	String name;
	int points;
	//constructor
	public Player() {
	}
	// constructor overload
	public Player(String name) {
		this.name = name;
	}
	/**
	 * method override toString method. Prints player name and points. 
	 * pre: none
	 * post:player name and points are printed. 
	 */
	public String toString() {
		String info = new String();
		info = "Player Name: " + this.name + "\nPoints: " + this.points;
		return (info);
	}
}
