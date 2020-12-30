package unitFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] a) {
		int length = a.length;
		int temp;
		int comparisions = 0;

		for (int i = 0; i < length - 1; i++) {
			// iterating through array after comparing all elements to one
			for (int j = 0; j < length - i - 1; j++) { // comparing one element to next element
				if (a[j] > a[j + 1]) {
					temp = a[j]; // swapping a[j+1] and a[j] if value of the index before > than the next value.
					a[j] = a[j + 1];
					a[j + 1] = temp;
					comparisions++;
					System.out.println(Arrays.toString(a));
				}
			}
		}
		System.out.println("Comparisions Made: " + comparisions);
	}

	public static void bubbleSortOp(int a[]) {
		boolean isSwapped;
		int length = a.length;
		int temp;
		int comparisions = 0;

		for (int i = 0; i < length - 1; i++) {
			// iterating through array after comparing all elements to one
			isSwapped = false;
			for (int j = 0; j < length - i - 1; j++) { // comparing one element to next element
				if (a[j] > a[j + 1]) {
					temp = a[j]; // swapping a[j+1] and a[j] if the value of the index before is greater than the
									// next value.
					a[j] = a[j + 1];
					a[j + 1] = temp;
					isSwapped = true; // remains true until value is reached that is not swapped.
					comparisions++;
					System.out.println(Arrays.toString(a));
				}
			}
			if (isSwapped == false) { // breaks out of the loop once isSwapped is false.
				break;
			}
		}
		System.out.println("\nComparisions Made: " + comparisions);
	}

	public static void main(String[] args) {
		int[] a = new int[5];
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		System.out.println(Arrays.toString(a));

		System.out.println(
				"\n********MENU*******\n1. Sort Array (Bubble Sort)\n2. Bubble Sort (Less Comparisions)\n3.Quit ");
		System.out.println("Enter your choice:");
		choice = input.nextInt();
		while (choice != 3) {
			if (choice == 1) {
				bubbleSort(a);
			} else if (choice == 2) {
				bubbleSortOp(a);
			}
			System.out.println(
					"\n********MENU*******\n1. Bubble Sort\n2. Bubble Sort (Less Comparisions)\n3.Quit ");
			System.out.println("Enter your choice:");
			choice = input.nextInt();
		}
		 if (choice == 3) {
			System.out.println("Thank you. Goodbye. ");
		}
		input.close();
	}
}
