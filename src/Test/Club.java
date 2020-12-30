package Test;

public class Club {
	public static int numOfMembers = 0;
	private String[] members;

	public Club(String[] theMembers) {
		members = theMembers;
		for (int i = 0; i < theMembers.length; i++) {
			numOfMembers++;
		}
	}

	public int getNumOfMembers() {
		return numOfMembers;
	}

	public String[] getMembers() {
		return members;
	}

}