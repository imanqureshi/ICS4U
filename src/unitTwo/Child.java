package unitTwo;

public class Child {
	//variable declaration
	String name;
	double money;
	//constructor
	public Child() {
	}
	//constructor overload
	public Child(String name, double money) {
		this.name = name;
		this.money = money;
	}
	/**
	 * method override toString method to return information about child. 
	 * pre: none
	 * post: Child name and balance is returned. 
	 */
	public String toString() {
		String info = new String();
		info = "\nChild Name:" + this.name;
		info += "\nBalance:" + this.money + "\n";
		return(info);
	}
}
