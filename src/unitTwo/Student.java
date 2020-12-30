package unitTwo;

import java.util.Scanner;
/**
 * Oct 28 2020
 * Iman Qureshi
 * ICS4U
 * This program is designed to get and display the first and last name for a student and
 * their age. 
 *
 */
public class Student {
	//variable declaration
	private String firstName;
	private String lastName;
	private int age;
	//constructor
	public Student() {
	}
	//overload of constructor
	public Student(String firstName, String lastName, int age) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.age = age;
	}
	/**
	 * Sets first name
	 * pre:none
	 * post:first name is set. 
	 */
	public void setFName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Sets last name
	 * pre:none
	 * post:last name is set. 
	 */
	public void setLName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * Sets age 
	 * pre:none
	 * post:age is set. 
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Returns first name
	 * pre:none
	 * post:first name is returned. 
	 */
	public String getFName() {
		return firstName;
	}
	/**
	 * returns last name
	 * pre:none
	 * post:last name is returned
	 */
	public String getLName() {
		return lastName;
	}
	/**
	 * returns age 
	 * pre:none
	 * post: age is returned. 
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * method override toString method to return student information.
	 * pre: none:
	 * post: information about student is returned
	 */
	public String toString() {
		String info = new String();
		info = "First Name: " + this.firstName;
		info += "\nLast Name: " + this.lastName;
		info += "\nAge: " + this.age;
		return(info);
	}
	public static void main(String [] args) {
		//variable declaration
		Student s1 = new Student();
		Scanner input = new Scanner(System.in);
		
		//input
		System.out.println("Please enter student's first name:");
		s1.setFName(input.nextLine());
		
		System.out.println("Please enter student's last name:");
		s1.setLName(input.nextLine());
		
		System.out.println("Please enter student's age:");
		s1.setAge(input.nextInt());
		
		//process
		input.close();

		//output
		System.out.println(s1.toString());
	}
}
