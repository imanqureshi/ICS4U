package unitThree;
/**
 * Iman Qureshi
 * ICS4U
 * Nov 8 2020
 * This program creates a pencilCase and its properties and behaviors. 
 */
public class PencilCase extends Box {
	private int ageGroup;

	/**
	 * Constructor 
	 * pre: none 
	 * post: pencilCase is created with age group
	 */
	public PencilCase(int age) {
		ageGroup = age;
	}

	/**
	 * Constructor overload 
	 * pre: none 
	 * post: pencilCase is created with age group set
	 * later by user.
	 */
	public PencilCase() {
	}
	/**
	 * sets age group
	 * pre: none 
	 * post: age group is set to age
	 */
	public void setAgeGroup(int age) {
		ageGroup = age;
	}
	/**
	 * gets age group
	 * pre: none 
	 * post: age group is returned
	 */
	public int getAgeGroup() {
		return ageGroup;
	}
	/**
	 * returns appropriate school level based on age group and colour of pencil case
	 * pre: none 
	 * post: age group is returned as a school
	 */
	public String audience() {
		String audience;
		if (ageGroup > 15 && super.getColour().equalsIgnoreCase("Black")
				|| ageGroup > 15 && super.getColour().equalsIgnoreCase("Blue")) {
			audience = "High School";
		} else if (ageGroup <= 15) {
			audience = "Elementary";
		} else {
			audience = "Elementary and Secondary";
		}
		return (audience);
	}

	/**
	 * displays info about age group and audience 
	 * pre: none. 
	 * post: information about age group is displayed
	 */
	public String toString() {
		String info;
		info = "Age Group: " + audience();
		return info;
	}
}
