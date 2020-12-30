package Test;

public class Beta extends Alpha {
	private int num;
	private boolean funny;

	public Beta(int myNum) {
		super();
		num = myNum;
		super.setValue(myNum - 3);
		funny = true;
	}

	public String display() {
		return ("\nvalue: " + getValue() + " num: " + num + "\nBeta Funny?: " + isFunny() + "\n");
	}
	public boolean isFunny() {
		if (getValue() % 2 == 0) {
			funny = true;
		} else {
			funny = false;
		}
		return funny;
	}
	public boolean equals(Object a) {
		Beta b = (Beta)a;
		if (num == b.num && isFunny() == b.isFunny() && getValue() == b.getValue()) {
			return true;
		} else
			return false;
	}
}
