package two2DArrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Date: October 1 2020 
 * Author: Iman Qureshi 
 * ICS4U 
 * This application is designed to implement and display a two-dimensional Array of 4x4 integer elements. 
 * It also calculates and displays the max negative element of the array and displays the Array 
 * so that all even elements are replaced by 0 and all odd elements by 1.
 */
public class Question2Two2DArray {
	final static int SIZE = 2;

	/**
	 * twoDArray is created. Calls for readTwoDArray which allows users to input
	 * integer elements into array. Prints array. Prints information about array
	 * including max negative integer and the twoDArray with even and odd
	 * replacements. 
	 * pre:none. 
	 * post:program is displayed to user.
	 */
	public static void main(String[] args) {
		int[][] twoDArray;
		twoDArray = new int[SIZE][SIZE];
		System.out.println(
				"Hello! Welcome to the 2D Array Activity! Lets begin!\nPlease fill out the 4x4 integer element array:\n");
		readTwoDArray(twoDArray);
		System.out.println("Here is your 2D Array!");
		printArray(twoDArray);
		System.out.println("\nINFORMATION ABOUT YOUR ARRAY");
		int maxNegNum = maxTwoDArray(twoDArray);
		if (maxNegNum < 0) {
			System.out.println("The maximum negative element of 2D Array is: " + maxNegNum);
		} else {
			System.out.println("There is no negative numbers in this 2D Array.");
		}
		replaceEvenOdd(twoDArray);
		printArray(twoDArray);
		System.out.println("Pretty cool, right?");
		System.out.println("\nThis is the end of your activity. Thank you!");
	}

	/**
	 * Reads a two-dimensional array named twoDArray with integer elements from the keyboard. 
	 * pre:none. 
	 * post:a 4x4 2D array is printed.
	 */
	public static void readTwoDArray(int[][] twoDArray) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < SIZE; i++) {
			System.out.println("You are now filling row: " + (i + 1));
			for (int j = 0; j < SIZE; j++) {
				System.out.println("Please enter element number " + (j + 1) + ": ");
				twoDArray[i][j] = scanner.nextInt();
			}
			if (i < SIZE - 1) {
				System.out.println("Moving onto the next row!");
			}
		}
		scanner.close();
	}

	/**
	 * Allows for twoDArray to be printed in an appropriate format. 
	 * pre:none.
	 * post:array is printed in appropriate 4x4 format.
	 */
	public static void printArray(int[][] twoDArray) {
		for (int i = 0; i < twoDArray.length; i++) {
			System.out.println(Arrays.toString(twoDArray[i]));
		}
	}

	/**
	 * Calculates the maximum negative value of the twoDarray. 
	 * pre:none. 
	 * post: returns the maximum negative element of the 2D Array.
	 */
	public static int maxTwoDArray(int[][] twoDArray) {
		int maxneg = Integer.MIN_VALUE;
		boolean existsNegative = false;
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				if (twoDArray[i][j] > maxneg && twoDArray[i][j] < 0) {
					maxneg = twoDArray[i][j];
					existsNegative = true;
				}
			}
		}

		if (existsNegative) {
			return maxneg;
		} else {
			return 0;
		}
	}

	/**
	 * Replaces all the even numbers in the twoDarray with 0 and all the odd numbers with 1. 
	 * pre:none. 
	 * post:twoDArray with the even and odd number replacements is created.
	 */
	public static void replaceEvenOdd(int[][] twoDArray) {

		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				if (twoDArray[i][j] % 2 == 0) {
					twoDArray[i][j] = 0;
				} else {
					twoDArray[i][j] = 1;
				}
			}
		}
		System.out.println("Here is your 2D Array displayed in a form where all the even numbers"
				+ "you inputed are replaced with 0 and all the odd numbers with 1:");
	}
}
