package unitThree;

/**
 * Iman Qureshi ICS4U Nov 11 2020 This program is designed to define a vehicle.
 *
 */
abstract class Vehicle {
	private String colour; // class attributes
	private String name;
	private String model;

	public Vehicle(String n, String c, String m) {
		name = n;
		colour = c;
		model = m;
	}

	public void setColour(String c) {
		colour = c;
	}

	public String getColour() {
		return colour;
	}

	public void setName(String n) {
		name = n;
	}

	public String getName() {
		return name;
	}
	public void setModel(String m) {
		model = m;
	}
	public String getModel() {
		return model;
	}

	abstract String drive();

	abstract String slowDown();

	abstract String Stop();

	public String honk() {
		return "Beeeeeep!";
	}
}
