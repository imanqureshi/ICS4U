package unitFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Iman Qureshi 
 * Nov 19 2020 
 * ICS4U 
 * This programs searches an unsorted array based on various functions.
 *
 */
public class UnsortedLinearSearch {
	public static int comparisions = 0;
	

	/**
	 * finds number in array 
	 * pre:none 
	 * post: entered number is returned.
	 */
	public static int findNum(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				comparisions++;
			}
			if (num == arr[i]) {
				comparisions++;
				return (i + 1);
			}
		}
		return (-1);
	}

	/**
	 * allows number to be inserted into array 
	 * pre: none: 
	 * post: number is placed in array so that it is still sorted.
	 */
	public static int[] insertIntoSorted(int[] arr, int num) {
		int index = 0;
		int[] result = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				index = i;
				break;
			}
			index = i + 1;
		}

		if (num > arr[arr.length - 1]) {
			System.arraycopy(arr, 0, result, 0, arr.length);
			result[result.length - 1] = num;
		}
		int counter = 0;
		for (int j = arr.length - 1; j >= index; j--) {
			result[j + 1] = arr[j];
			if (counter < index) {
				result[counter] = arr[counter];
			}
			counter++;
		}

		result[index] = num;
		return result;
	}

	/**
	 * 
	 * finds locations of given number in array if it occurs more than once 
	 * pre:none 
	 * post: locations are displayed if num occurs more than once
	 */
	public static String findNums(int[] arr, int num) {
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if (num != arr[i]) {
				comparisions++;
			}
			if (num == arr[i]) {
				result = result + (i + 1) + ",";
				comparisions++;
			}
		}
		if (result.isEmpty()) {
			return "-1";
		} else {
			return result.substring(0, result.length() - 1);
		}
	}

	/**
	 * returns min value in array 
	 * pre: none 
	 * post: first element in array is returned
	 * 
	 */
	public static int findMinValue(int[] arr) {
		int num = arr[0];
		for (int i= 1; i < arr.length; i++) {
			if (arr[i] <= num) {
				num = arr[i];
			}
		}
		return num;
	}

	/**
	 * returns max value in array 
	 * pre: none 
	 * post: last element in array is returned
	 */
	public static int findMaxValue(int[] arr) {
		int num = arr[0];
		for (int i= 1; i < arr.length; i++) {
			if (arr[i] >= num) {
				num = arr[i];
			}
		}
		return num;
	}

	/**
	 * displays menu for the user to choose from 
	 * pre: none 
	 * post: menu is displayed.
	 */
	public static String menu() {
		String info;
		info = "\n******* MENU *******\n\n" 
				+ "1. Find Location of a Number\n" 
				+ "2. Find all locations of a Number\n"
				+ "3. Insert a Number into Array\n" 
				+ "4. Find Max Value\n"
				+ "5. Find Min Value\n"
				+ "6. Quit";
		return info;
	}

	public static void main(String[] args) {
		int[] a = new int[10];
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(50) + 1;
		}
		System.out.println(Arrays.toString(a));

		System.out.println(menu());
		choice = input.nextInt();

		while (choice != 6) {
			if (choice == 1) {
				System.out.println("Please enter a Number. (If your number can not be found, -1 will be displayed)");
				choice = input.nextInt();
				System.out.println("Location: Spot #" + findNum(a, choice));
				System.out.println("\nComparisions made: " + comparisions);

			} else if (choice == 2) {
				System.out.println("Please enter a Number. (If your number can not be found, -1 will be displayed)");
				choice = input.nextInt();
				System.out.println("Location: Spot #" + findNums(a, choice));
				System.out.println("\nComparisions made: " + comparisions);
			} else if (choice == 3) {
				System.out.println("Please enter what number you would like to fill in the array:");
				choice = input.nextInt();
				System.out.println(Arrays.toString(insertIntoSorted(a, choice)));
			} else if (choice == 4) {
				System.out.println("Max Value: " + findMaxValue(a));
			} else if (choice == 5) {
				System.out.println("Min Value: " + findMinValue(a));
			}
			System.out.println(menu());
			choice = input.nextInt();
		}
		if (choice == 6) {
			System.out.println("\nThank you.\n\nComparisions Made: " + comparisions);
		}
	}
}
