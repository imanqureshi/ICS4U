package Test;

public class Rectangle {
	private int x;
	private int y;
	private int l;
	private int h;
	private int tempx;
	private int tempy;

	/**
	 * constructor pre: none post: A rectangle object created. Length, width and x
	 * and y coordinates initialized to 0.
	 */
	public Rectangle() {
		x = 0;
		y = 0;
		l = 0;
		h = 0;
		tempx = 0;
		tempy = 0;
	}

	/**
	 * constructor overload pre: none post: A rectangle object created. Length,
	 * width and x and y coordinates are initialized by values passed in parameter.
	 */
	public Rectangle(int xc, int yc, int lengtht, int height) {
		x = xc;
		y = yc;
		l = lengtht;
		h = height;
	}

	/**
	 * Returns x coordinate pre: none post: x coordinate is returned.
	 */
	public int getXCoor() {
		return x;
	}

	/**
	 * Returns y coordinate pre: none post: y coordinate is returned.
	 */
	public int getYCoor() {
		return y;
	}

	/**
	 * Returns length pre: none post: length is returned.
	 */
	public int getLength() {
		return l;
	}

	/**
	 * Returns height pre: none post: height is returned.
	 */
	public int getHeight() {
		return h;
	}

	public int getTempX() {
		return tempx;
	}

	public int getTempY() {
		return tempy;
	}

	/**
	 * Returns sets x coordinate pre: none post: x coordinate is set.
	 */
	public void setXCoor(int xt) {
		x = xt;
	}

	/**
	 * sets value of y coordinate pre: none post: y coordinate is set.
	 */
	public void setYCoor(int yt) {
		y = yt;
	}

	/**
	 * sets value of length. pre: none post: length is set.
	 */
	public void setLength(int lt) {
		l = lt;
	}

	/**
	 * sets value of height pre: none post: height is set.
	 */
	public void setHeight(int ht) {
		h = ht;
	}

	/**
	 * finds x value for the left corner of rectangle based on user input of
	 * starting point choice pre: none post: x value of left corner is returned.
	 */
	public int findLeftCornerX(int corner, int xt, int lt) {
		if (corner == 1 || corner == 3) {
			return (xt);
		} else {
			return (xt - lt);
		}
	}

	/**
	 * finds y value for the left corner of rectangle based on user input of
	 * starting point choice pre: none post: y value of left corner is returned.
	 */
	public int findLeftCornerY(int corner, int yt, int ht) {
		if (corner == 1 || corner == 2) {
			return (yt);
		} else {
			return (yt - ht);
		}
	}

	/**
	 * sets value for temp x coordinate. pre: none post: temp x is set.
	 */
	public void tempX(int xt) {
		tempx = xt;
	}

	/**
	 * sets value for temp y coordinate. pre: none post: temp y is set.
	 */
	public void tempY(int yt) {
		tempy = yt;
	}

	/**
	 * reutrns area for individual rectangles pre: none post: area for individual
	 * rectangles is returned
	 */
	public int area() {
		return (l * h);
	}

	/**
	 * returns the perimeter of the rectangle pre: none post: perimeter is returned.
	 */
	public int perimeter() {
		return (2 * (l + h));
	}

	/**
	 * calculates where the overlap takes place pre: none post: returns the value of
	 * how much it overlaps by
	 */
	public int Overlap(int x1t, int x2t, int l1t, int l2t) {
		int x1;
		int x2;
		int l1;
		int l2;
		int exception;
		int overlap;

		if (x1t <= x2t) { // This is to save a repetitive if statement
			x1 = x1t;
			l1 = l1t;
			x2 = x2t;
			l2 = l2t;
		} else {
			x1 = x2t;
			l1 = l2t;
			x2 = x1t;
			l2 = l1t;
		}

		if (x1 + l1 >= x2 + l2) { // Checking if there is need to take into account and double overlap
			exception = (x1 + l1 - x2 - l2);
		} else {
			exception = 0;

		}
		overlap = x1 + l1 - x2 - exception;
		if (overlap < 0) { // Returns overlap if greater than 0
			return 0;
		} else {
			return overlap;
		}
	}

	/**
	 * checks if there is space between rectangles pre: none post: returns false if
	 * there is space meaning rectangles dont overlap
	 */
	public boolean SpaceCheck(int x1t, int x2t, int l1t, int l2t, int y1t, int y2t, int h1t, int h2t) {
		int x1, x2, l1;
		int y1, y2, h1;

		if (x1t <= x2t) {
			x1 = x1t;
			l1 = l1t;
			x2 = x2t;
		} else {
			x1 = x2t;
			l1 = l2t;
			x2 = x1t;
		}

		if (y1t <= y2t) {
			y1 = y1t;
			h1 = h1t;
			y2 = y2t;
		} else {
			y1 = y2t;
			h1 = h2t;
			y2 = y1t;
		}

		if (x2 - x1 - l1 > 0 || y2 - y1 - h1 > 0) {
			return false;
		}
		return true;

	}

	/**
	 * returns the total area of two rectangles pre: overx & overy must be greater
	 * than 0 post: total area is returned.
	 */
	public int areaIfOverlap(Object a, int overx, int overy) {
		Rectangle r = (Rectangle) a;
		return (area() + r.area() - (overx * overy));
	}

	/**
	 * returns the total perimeter of two rectangles pre: overx & overy must be
	 * greater than 0 post: total area is returned.
	 */
	public int perimeterIfOverlap(Object a, int overx, int overy) {
		Rectangle r = (Rectangle) a;
		return (perimeter() + r.perimeter() - (2 * (overx + overy)));
	}

	/**
	 * toString override method to return info of individual rectangle info pre:
	 * none post: information on starting point, length, and width are returned
	 */
	public String toString() { // overriding toString method to print rectangle info
		String info;
		info = "\nStarting point: (" + x + "," + y + ")\nLength: " + l + "\nWidth: " + h + "\nArea: " + area()
				+ "\nPerimeter: " + perimeter();
		return (info);
	}
}