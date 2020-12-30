package unitFour;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int comparisons = 0; 
		int n = arr.length; 
	        for (int i = 1; i < n; ++i) { 
	            int key = arr[i]; 
	            int j = i - 1; 
	            while (j >= 0 && arr[j] > key) { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
	            } 
	            arr[j + 1] = key; 
	            comparisons++;
				System.out.println(Arrays.toString(arr));
	        } 
	        
			System.out.println("\nComparisions Made: " + comparisons);
			
	}

//	public static void insertionSortt(int[] arr) {
//		int prevIndex;
//		int comparisons = 0;
//		for (int i = 1; i < arr.length; i++) {
//			prevIndex = i - 1;
//			while ((arr[prevIndex] > arr[i]) && (prevIndex > 0)) {
//				arr[prevIndex + 1] = arr[prevIndex];
//				prevIndex -= 1;
//			}
//			if (arr[prevIndex] > arr[i]) {
//				arr[prevIndex + 1] = arr[prevIndex];
//				arr[prevIndex] = arr[i];
//			} else {
//				arr[prevIndex + 1] = arr[i];
//			}
//			comparisons++;
//			System.out.println(Arrays.toString(arr));
//		}
//		System.out.println("Comparisions Made: " + comparisons);
//	}

	public static void main(String[] args) {
		int[] a = {5,3,8,1,6,4,2,7};

//		int[] a = new int[10];
		Random rand = new Random();
		int choice;
		Scanner input = new Scanner(System.in);

//		for (int i = 0; i < a.length; i++) {
//			a[i] = rand.nextInt(20) + 1;
//		}

		System.out.println(Arrays.toString(a));

		System.out.println("\n********MENU*******\n1. Sort Array (Insertion Sort)\n2. Quit ");
		System.out.println("Enter your choice:");
		choice = input.nextInt();

		while (choice != 2) {
			if (choice == 1) {
				insertionSort(a);
			}
			System.out.println("\n********MENU*******\n1. Sort Array (Insertion Sort)\n2. Quit ");
			System.out.println("Enter your choice:");
			choice = input.nextInt();
		}
		if (choice == 2) {
			System.out.println("Thank you. Goodbye.");
		}
	}
}
