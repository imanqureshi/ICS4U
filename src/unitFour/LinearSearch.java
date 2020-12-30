package unitFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * Iman Qureshi
 * Nov 19 2020
 * ICS4U
 * This programs searches a sorted array based on various functions. 
 *
 */
public class LinearSearch {
	public static int comparisions;
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
		
		if (num > arr[arr.length-1]) {
			System.arraycopy(arr, 0, result, 0, arr.length);
			result[result.length-1] = num;
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
 * pre: none
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
		return arr[0];
	}
/**
 * returns max value in array
 * pre: none
 * post: last element in array is returned
 */
	public static int findMaxValue(int[] arr) {
		return arr[arr.length - 1];
	}
/**
 * finds median in array 
 * pre: none
 * post: median is returned
 */
	public static double findMedian(int arr[]) {
		int middle = ((arr.length) / 2);
		double medianA;
		double medianB;
		double median;
		if (arr.length % 2 == 0) {
			medianA = arr[middle];
			medianB = arr[middle - 1];
			median = (medianA + medianB) / 2;
		} else {
			median = arr[middle + 1];
		}
		return median;
	}
	/**
	 * finds user num using binary search
	 * pre: none
	 * post: num is returned if found. if not found, minus 1 is returned. 
	 */
    public static int binarySearch(int arr[], int num) { 
        int bottom = 0;
        int top = arr.length - 1; 
        int middle;
        
        while (bottom <= top) { 
            middle = bottom + (top - bottom) / 2; 
  
            if (arr[middle] == num) { 
                return (middle + 1); 
  
            } else if (arr[middle] < num) {
                bottom = middle + 1; 
  
            } else
                top = middle - 1; 
        comparisions++;
        } 
        return -1; 
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
				+ "6. Find Median\n"
				+ "7. Quit";
		return info;
	}

	public static void main(String[] args) {
		int[] a = new int[] { 3, 8, 9, 10, 10, 15, 32, 35, 36, 48};
//		int[] a = new int[10];
		int choice;
		Scanner input = new Scanner(System.in);
		
//		Random rand = new Random();
//		int num;
//		
//		a[0] = rand.nextInt(1);
//		for (int i = 1; i < a.length; i++) {
//			num = rand.nextInt(50) + 1;
//			while (num < a[i-1]) {
//				num = rand.nextInt(50) + 1;
//			}
//			if (num >= a[i-1]) {
//				a[i] = num;
//			}
//		}
		System.out.println(Arrays.toString(a));
		
		System.out.println(menu());
		choice = input.nextInt();

		while (choice != 7) {
			if (choice == 1) {
				System.out.println("\n1. Linear Search\n2. Binary Search\nEnter your choice:");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Please enter a Number. (If your number can not be found, -1 will be displayed)");
					choice = input.nextInt();
					System.out.println("Location: Spot #" + findNum(a, choice));
				} else {
					System.out.println("Please enter a Number. (If your number can not be found, -1 will be displayed)");
					choice = input.nextInt();
					System.out.println("Location Spot: " + binarySearch(a,choice));
				}
			} else if (choice == 2) {
				System.out.println("Please enter a Number. (If your number can not be found, -1 will be displayed)");
				choice = input.nextInt();
				System.out.println("Location: Spot #" + findNums(a, choice));
			} else if (choice == 3) {
				System.out.println("Please enter what number you would like to fill in the array:");
				choice = input.nextInt();
				System.out.println(Arrays.toString(insertIntoSorted(a, choice)));
			} else if (choice == 4) {
				System.out.println("Max Value: " + findMaxValue(a));
			} else if (choice == 5) {
				System.out.println("Min Value: " + findMinValue(a));
			} else if (choice == 6) {
				System.out.println("Median: " + findMedian(a));
			}
			System.out.println(menu());
			choice = input.nextInt();
		}
		if (choice == 7) {
			System.out.println("\nThank you.\n\nComparisions Made: " + comparisions);
		}
	}

}
