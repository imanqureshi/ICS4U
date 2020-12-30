package Test;

public class SchoolClub extends Club {
	private String advisor;

	public SchoolClub(String theAdvisor, String[] theMembers) {
		super(theMembers);
		advisor = theAdvisor;
	}

	public String getAdvisor() {
		return advisor;
	}

	public boolean equals(Object a) {
		SchoolClub sc = (SchoolClub) a;
		String[] array = getMembers();
		String[] arrayt = sc.getMembers();
		if (array.length != arrayt.length) {
			return false;
		}

		for (int i = 0; i < array.length; i++) {
			if (!array[i].equals(arrayt[i]) || !advisor.equals(sc.advisor)) {
				return false;
			}
		}
		return true;
	}
}
