package unitFour;
/**
 * Iman Qureshi
 * Nov 26 2020
 * ICS4U
 * This program sorts an array using a selection sort algorithm. 
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		int maxNum = 0;
		int maxIndex = 0;
		int temp = 0;
		int comparisons = 0;
		for (int i = arr.length - 1; i >= 0; i--) {		//sets last number as max num and index.
			maxNum = arr[i];
			maxIndex = i;
			for (int j = 0; j < i; j++) {			//iterates through rest of array to find a number greater than last num.
				if (arr[j] > maxNum) {			
					maxNum = arr[j];
					maxIndex = j;
				}
				if (maxNum > arr[i]) {				//swap
					temp = arr[i];
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;
					
				}
				comparisons++;
			}
			System.out.println("Largest Number: " + maxNum);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("\nTotal Comparisions Made: " + comparisons);
		return arr;
	}

	public static void main(String[] args) {
		int[] a = {5,3,8,1,6,4,2,7};
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);
//
//		for (int i = 0; i < a.length; i++) {
//			a[i] = rand.nextInt(20) + 1;
//		}


		System.out.println(Arrays.toString(a));

		System.out.println("\n********MENU*******\n1. Sort Array (Selection Sort)\n2. Quit ");
		System.out.println("Enter your choice:");
		choice = input.nextInt();

		while (choice != 2) {
			if (choice == 1) {
				System.out.println(Arrays.toString(selectionSort(a)));
			}
			System.out.println("\n********MENU*******\n1. Sort Array (Insertion Sort)\n2. Quit ");
			System.out.println("Enter your choice:");
			choice = input.nextInt();
		}
		if (choice == 2) {
			System.out.println("Thank you. Goodbye.");
		}
		input.close();
	}
}
