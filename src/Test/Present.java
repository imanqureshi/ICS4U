package Test;

public class Present {
	private String contents;

	public Present(String theContents) {
		contents = theContents;
	}

	public String getContents() {
		return (contents);
	}

	public void setContents(String theContents) {
		contents = theContents;
	}

	public String toString() {
		return ("Contains " + getContents());
	}
}
