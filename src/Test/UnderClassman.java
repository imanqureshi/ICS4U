package Test;

public class UnderClassman extends Student {
	public int homeRoomNum;
	private String counselor;

	public UnderClassman(int year, double gpa, int newRoomNum, String newCounselor) {
		super(year, gpa);
		homeRoomNum = newRoomNum;
		counselor = newCounselor;
	}
}
