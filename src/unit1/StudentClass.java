package unit1;

import java.util.Scanner;

//declare class Student
class Student {
	String firstName;
	String lastName;
	String hobby;
	int age;

	// constructor
	public Student() {
	}

	// constructor overload
	public Student(String firstName, String lastName, String hobby, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.hobby = hobby;
		this.age = age;
	}

	// method that calculates student's grade based on age
	private int grade() {
		int grade = 0;
		if (age == 14) {
			grade = 9;
		} else if (age == 15) {
			grade = 10;
		} else if (age == 16) {
			grade = 11;
		} else if (age == 17) {
			grade = 12;
		}
		return grade;
	}

	// method which returns a string of all info on student
	public String getInfo() {
		String info;

		info = "Name: " + firstName + " " + lastName + "\n";
		info += "Age: " + age + "\n";
		info += "Hobby: " + hobby + "\n";
		info += "Grade: " + grade() + "\n";
		return (info);
	}
}
public class StudentClass {
	public static void main(String[] args) {
		// variables
		Student student1 = new Student();
		Scanner scanner = new Scanner(System.in);

		// input
		System.out.println("Please enter your first name:");
		student1.firstName = scanner.nextLine();

		System.out.println("Please enter your last name:");
		student1.lastName = scanner.nextLine();

		System.out.println("Please state a hobby of yours:");
		student1.hobby = scanner.nextLine();

		System.out.println("Please enter your age:");
		student1.age = scanner.nextInt();

		scanner.close();
		// process and output
		System.out.println("Information about student:\n" + student1.getInfo());
	}
}