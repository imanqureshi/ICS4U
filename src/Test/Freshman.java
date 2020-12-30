package Test;

public class Freshman extends UnderClassman {
	private int middleSchoolCode; 
	
	public Freshman (int gradYear, double gpa, int homeRoomNum, String  counselor, int middleSchoolCode) {
		super(gradYear, gpa,homeRoomNum, counselor);
		this.middleSchoolCode = middleSchoolCode;
	}
}
