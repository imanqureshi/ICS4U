package Test;

public class Gemma extends Alpha {
	private int num;
	private String postal_code = "A0A0A0";

	public Gemma(int myNum) {
		super();
		num = myNum;
	}
	
	public Gemma(String postal) {
		super();
		postal = postal_code;
		
	}

	public String display() {
		return ("num: " + num + " value: " + getValue());
	}
}
