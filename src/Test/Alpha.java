package Test;

public abstract class Alpha {
	private int value = 4;

	public Alpha() {
	}

	public abstract String display();

	public void setValue(int n) {
		value = n;
	}

	public int getValue() {
		return value;
	}
}
