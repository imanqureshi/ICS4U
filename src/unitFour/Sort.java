package unitFour;

import java.util.Arrays;

public class Sort {

	public static int binarySearch(int arr[], int num) {
		int bottom = 0;
		int top = arr.length - 1;
		int middle;
//		int comparisons = 0;
		while (bottom <= top) {
			middle = bottom + (top - bottom) / 2;

			if (arr[middle] == num) {
				return (middle + 1);

			} else if (arr[middle] < num) {
				bottom = middle + 1;

			} else
				top = middle - 1;
//			comparisons++;
		}
		return -1;
	}

	public static int[] bubbleSort(int[] arr) {
		boolean isSwapped = true;
		int iteration = 0;
		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i < arr.length - 1 - iteration; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSwapped = true;
				}
			}
			iteration++;
			System.out.print("\nIteration " + iteration + " : ");
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

	public static int[] insertionSort(int[] arr) {
		int comparisons = 0;
		int n = arr.length;
		int iteration = 0;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
			comparisons++;
			iteration++;
			System.out.print("\nIteration " + iteration + " : ");
			System.out.println(Arrays.toString(arr));
		}

		System.out.println("\nComparisions Made: " + comparisons);

		return arr;
	}

	public static void insertionsortt(int[] arr) {
		int min_loc = 0;
		int place_at = 0;
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				counter++;
				if (arr[i] < arr[j]) {
					min_loc = i;
					place_at = j;
					break;
				}
			}
			int min_value = arr[min_loc];
			for (int j = min_loc; j > place_at; j--) {
				arr[j] = arr[j - 1];
			}
			arr[place_at] = min_value;
			min_loc = 0;
			place_at = 0;
		}

	}

	public static int[] selectionSort(int[] arr) {
		int maxNum = 0;
		int maxIndex = 0;
		int temp = 0;
//		int comparisons = 0;
		for (int i = arr.length - 1; i >= 0; i--) { // sets last number as max num and index.
			maxNum = arr[i];
			maxIndex = i;
			for (int j = 0; j < i; j++) { // iterates through rest of array to find a number greater than last num.
				if (arr[j] > maxNum) {
					maxNum = arr[j];
					maxIndex = j;
				}
				if (maxNum > arr[i]) { // swap
					temp = arr[i];
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;

				}
//				comparisons++;
			}
			System.out.println("Largest Number: " + maxNum);
			System.out.println(Arrays.toString(arr));
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] a = { 5, 4, 30, 43, 23, 54, 5, 4, 5, 23 };

		System.out.println("\nSorted Array: " + Arrays.toString(bubbleSort(a)));
	}
}