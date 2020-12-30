package recursion;

import java.util.Scanner;

public class Main {

	public static void menu() {
		System.out.println("\n*****Menu*****");
		System.out.println("1. Sort CDs by genre (Pop, Rock, Country, Jazz)");
		System.out.println("2. Display CDs sorted by number of songs.");
		System.out.println("3. Display CDs sorted by favorite or not");
		System.out.println("4. Find CD");
		System.out.println("5. List all favourite CDs");
		System.out.println("6. Quit");
		System.out.println("Enter your choice:");
	}

	public static void main(String[] args) {
		// variable declaration
		Cd[] stack = new Cd[10];
		int choice;
		Scanner input = new Scanner(System.in);

		// initializing each CD object in array.
		for (int i = 0; i < stack.length; i++) {
			stack[i] = new Cd();
			stack[i].randFavourite();
			stack[i].randGenre();
			stack[i].randNumSongs();
		}
		for (int i = 0; i < stack.length; i++) {
			System.out.println(stack[i]);
		}


		menu();
		choice = input.nextInt();

		while (choice != 6) {
			if (choice == 1) { // bubble sort genre
				System.out.println("Array Sorted by Genre: ");
				bubbleSort(stack);
				System.out.println();
				for (int i = 0; i < stack.length; i++) {
					System.out.println(stack[i]);
				}
			} else if (choice == 2) {
				insertionSort(stack);
				System.out.println();
				for (int i = 0; i < stack.length; i++) {
					System.out.println(stack[i]);
				}
			} else if (choice == 3) {
				selectionSort(stack);
				System.out.println();
				for (int i = 0; i < stack.length; i++) {
					System.out.println(stack[i]);
				}
			} else if (choice == 4) {
				System.out.println("Enter a CD genre");
				String c1 = input.next();
				System.out.println("Enter number of songs in CD");
				int c2 = input.nextInt();
				findCD(stack, c1, c2);
			} else if (choice == 5) {
				int index = 0;
				favouriteCD(stack, index);
			}
			menu();
			choice = input.nextInt();
		}
		if (choice == 6) {
			System.out.println("Thank you. Goodbye.");
		}
	}

	public static void bubbleSort(Cd[] arr) {
		   boolean isSwapped = true;
	        Cd temp;
	        while(isSwapped) {
	         isSwapped = false;
	         for (int i = 0; i < arr.length-1; i ++) {
	             if (arr[i].getGenre().compareTo(arr[i+1].getGenre())> 0) {
	                 temp = arr[i]; 
	                 arr[i] = arr[i+1];
	                 arr[i+1] = temp;
	                 isSwapped = true;
	             }
	         }
	     }
	        for (int i = 0; i < arr.length; i ++) {
	        	System.out.println(arr[i] + "");
	        }
		
	}
//		boolean isSwapped = true;
//		Cd temp;
//		do {
//			for (int i = 0; i < arr.length - 1 && isSwapped; i++) {
//				isSwapped = false;
//					if (arr[i].getGenre().charAt(0) > (arr[i + 1].getGenre().charAt(0))) {
//						temp = arr[i];
//						arr[i] = arr[i + 1];
//						arr[i + 1] = temp;
//					}
//					for (int j = 0; j < arr.length-1 && !isSwapped; j++) {
//					if (arr[j].getGenre().charAt(0) > (arr[j + 1].getGenre().charAt(0))) {
//						isSwapped = true;
//					}
//				}
//			}
//		} while (isSwapped);
//		
//		for (int k = 0; k < arr.length; k++) {
//			System.out.println(arr[k] + "\n");
//		}
//	}

	public static void insertionSort(Cd[] arr) {
		int min_loc = 0;
		int place_at = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i && min_loc == 0; j++) {
				if (arr[i].getNumSongs() < arr[j].getNumSongs()) {
					min_loc = i;
					place_at = j;
				}
			}
			Cd min_val = arr[min_loc];
			for (int j = min_loc; j > place_at; j--) {
				arr[j] = arr[j - 1];

			}
			arr[place_at] = min_val;
			min_loc = 0;
			place_at = 0;

		}
	}

	public static void selectionSort(Cd[] arr) {
		for (int i = arr.length; i > 1; i--) {
			int max = i;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].getFavourite()) {
					max = j;
				}
			}
			Cd key = arr[max];
			arr[max] = arr[i - 1];
			arr[i - 1] = key;
		}
	}

	public static void findCD(Cd arr[], String c1, int c2) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getGenre().equalsIgnoreCase(c1) && arr[i].getNumSongs() == c2) {
				System.out.println(arr[i]);
			}
		}
	}

	public static Cd favouriteCD(Cd arr[], int index) {
		if (index < arr.length) {
			if (arr[index].getFavourite()) {
				System.out.println(arr[index]);
			}
			return favouriteCD(arr, index + 1);
		}
		return null;
	}

}
