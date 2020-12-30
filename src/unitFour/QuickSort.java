package unitFour;

import java.util.*;

/**
 * Iman Qureshi 
 * Dec 1 2020 
 * ICS4U 
 * This program sorts an array using the Quicksort method.
 *
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] a = new int[10];
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100) + 1;
		}

		System.out.println("Unsorted Array: \n" + Arrays.toString(a) + "\n");

		System.out.println("1. Quick Sort Array\n2. Generate new array\n3. Quit\nEnter your choice: ");
		choice = input.nextInt();

		while (choice != 3) {
			if (choice == 1) {
				quickSort(a, 0, a.length - 1);
				System.out.println("\nSorted Array: \n" + Arrays.toString(a));
			} else if (choice == 2) {
				for (int i = 0; i < a.length; i++) {
					a[i] = rand.nextInt(100) + 1;
				}
				System.out.println("Unsorted Array: \n" + Arrays.toString(a) + "\n");
			}
			System.out.println("\n1. Quick Sort Array\n2. Generate new array\n3. Quit\nEnter your choice: ");
			choice = input.nextInt();
		}

	}

	/**
	 * recursively sorts the array by calling on the partition method until array is
	 * sorted. 
	 * pre:none 
	 * post: array is sorted in ascending order.
	 *
	 */
	public static void quickSort(int[] a, int start, int end) {

		// partitionIndex is the sorted position of AN element.
		int partitionIndex = partition(a, start, end);
		System.out.println("\nThe element: " + a[partitionIndex] + " at index: " + partitionIndex + " is sorted. \n"
				+ Arrays.toString(a));

		// we need to ensure that the sorted position is not the first element,
		// or index out of bounds. -1 since partition index is sorted so we sort
		// everything in the array that is LESS than the already sorted item.
		if (partitionIndex - 1 > start) {
			// recursively sort the left side of the sorted pivot
			quickSort(a, start, partitionIndex - 1);
		}

		// same situation applies but with the last element. we need to check to make
		// sure that the
		// sorted position is not the last element or index will be out of bounds.
		if (partitionIndex + 1 < end) {
			// recursively sort the right side of the sorted pivot
			quickSort(a, partitionIndex + 1, end);
		}
	}

	/**
	 * returns index of sorted pivot element (last element in array) while placing
	 * all values less than the element on the left and all values greater on the
	 * right. 
	 * pre:none 
	 * post: index of the sorted pivot element (last element in array) is returned
	 *
	 */
	public static int partition(int[] arr, int start, int end) {

		// The pivot is the last element in the array and this does not change during
		// this whole function.
		int pivot = arr[end];

		// This for loop runs through the array until the integer INDEX
		// 'start' points at the correct spot for the PIVOT element (the LAST ELEMENT)
		// and then it exits the loop.
		for (int i = start; i < end; i++) {
			if (arr[i] < pivot) {
				int x = arr[start];
				arr[start] = arr[i];
				arr[i] = x;
				start++;
			}
		}

		// When for loop is exited, the variable 'start' is the correct spot for the
		// pivot (last element index 'end') to be. So we put the last element(pivot)
		// where start is.
		int temp = arr[start];
		arr[start] = pivot;
		arr[end] = temp;

		// start is returned since this is the index of the now sorted pivot point
		// in the soon to be sorted array.
		return start;
	}

}
