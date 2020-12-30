package unitFour;

import java.util.Arrays;

public class Test {
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
		int[] a = {7, 2, 1, 5, 6};
		selectionSort(a);
	}

}
