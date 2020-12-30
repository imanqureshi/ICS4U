package unit1;

import java.util.Scanner;

//declare class Rhombus
class Rhombus {
	double diagonal1;
	double diagonal2;
	//constructor 
	public Rhombus() {
		diagonal1 = 0;
		diagonal2 = 0;
	}
	//constructor overload
	public Rhombus(double d1, double d2) {
		diagonal1 = d1;
		diagonal2 = d2;
	}
	//method to calculate side length of Rhombus
	public double side() {
		double side = Math.sqrt(Math.pow(diagonal1,2) + Math.pow(diagonal2, 2))/2;
		return side;
	}
	//method to calculate area of Rhombus
	public double area() {
		double area;
		area = 0.5 *diagonal1*diagonal2;
		return area;

	}
	//method to calculate perimeter of Rhombus
	public double perimeter() {
		double perimeter = 4*side();
		return perimeter;
	}
	//method toString to override methods
	public String toString() {
		String info = new String();
		info = "Value of first diagonal: " + this.diagonal1 
		+ "\nValue of second diagonal: " + this.diagonal2;
		return(info);
	}
}
public class RhombusClass {
	public static void main(String[] args) {
		//variables
		Rhombus r1 = new Rhombus();
		Scanner scanner = new Scanner(System.in);
		
		//input
		System.out.println("Please enter the value of the first diagonal of the rhombus:");
		r1.diagonal1 = scanner.nextDouble();
		
		System.out.println("Please enter the value of the second diagonal of the rhombus:");
		r1.diagonal2 = scanner.nextDouble();
		
		scanner.close();
		//process and output
		System.out.println(r1.toString());
		
		System.out.println("The length of the sides of the rhombus is: " + r1.side());
		
		System.out.println("The area of the rhombus is: " + r1.area());
		
		System.out.println("The perimeter of the rhombus is: " + r1.perimeter());
	}
}
