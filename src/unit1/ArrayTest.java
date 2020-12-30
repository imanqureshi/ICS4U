package unit1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Date: October 7 2020 
 * Author: Iman Qureshi 
 * ICS4U 
 * This program allows users to fill a 4x4 array and displays array. 
 * It also calculates and displays the sum of the max numbers in each row 
 * and the sum of all the even elements from all of the odd rows.
 */
public class ArrayTest {
	public static void main(String[] args) {
		int rows = 4;
		int cols = 4;
		
		System.out.println("Welcome to the twoDArray Program.");
		System.out.println("Please fill the following 4x4 array:");
		int[][] twoDArray = new int[rows][cols];
		readArray(twoDArray);
		
		System.out.println("INFORMATION ABOUT YOUR ARRAY");
		int sumofRowsMaxs = maxNumRows(twoDArray);
		System.out.println("The sum of the max num of each row of the array is: " + sumofRowsMaxs);
		evenNumOddRowSum(twoDArray);
	}

	/**
	 * Allows user to fill in the array. Then calls on print array 
	 * method to print the array. 
	 * pre:none 
	 * post: Array is filled with integers and displayed.
	 */
	public static void readArray(int[][] twoDArray) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < twoDArray.length; i++) {
			System.out.println("You are now filling row: " + (i + 1));
			for (int j = 0; j < twoDArray.length; j++) {
				System.out.println("Please enter element number " + (j + 1) + ": ");
				twoDArray[i][j] = scanner.nextInt();
			}
			if (i < 4 - 1) {
				System.out.println("Moving onto the next row!");
			}
		}
		scanner.close();
		System.out.println("Here is your array:");
		printArray(twoDArray);
	}

	/**
	 * Allows the 2D Array to be printed. 
	 * pre:Array must exist. 
	 * post: Array is printed and formatted correctly.
	 */
	public static void printArray(int[][] twoDArray) {
		for (int i = 0; i < twoDArray.length; i++) {
			System.out.println(Arrays.toString(twoDArray[i]));
		}
	}

	/**
	 * Calculates and returns the sum of the max numbers of each row. 
	 * pre:Array must exist. 
	 * post: The sum of the max numbers of each row is calculated/returned.
	 */
	public static int maxNumRows(int[][] twoDArray) {
		int currentRowMax = Integer.MIN_VALUE;
		int sumOfMaxValues = 0;
		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[0].length; j++) {
				if (twoDArray[i][j] > currentRowMax) {
					currentRowMax = twoDArray[i][j];
				}
			}
			System.out.println("The max for row " + (i + 1) + " is: " + currentRowMax);
			sumOfMaxValues += currentRowMax;
			currentRowMax = Integer.MIN_VALUE;
		}
		return sumOfMaxValues;
	}

	/**
	 * Calculates and prints the sum of all the even elements from all of the odd rows 
	 * pre:Array must exist. 
	 * Post: the sum of all the even elements from all of
	 * the odd rows is calculated and displayed.
	 */
	public static void evenNumOddRowSum(int[][] twoDArray) {
		int runningSum = 0;
		for (int i = 0; i < twoDArray.length; i += 2) {
			for (int j = 0; j < twoDArray[0].length; j++) {
				if (twoDArray[i][j] % 2 == 0) {
					runningSum += twoDArray[i][j];
				}
			}
		}
		System.out.println("The sum of all the even elements from all of the odd rows is: " + runningSum);
	}

}
