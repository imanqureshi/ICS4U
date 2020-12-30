package sortTest;

import java.util.*;

/**
 * Iman Qureshi 
 * Dec 16 2020 
 * ICS4U 
 * This program creates an array of tShirt objects and allows a user to choose between various options to sort and
 * search the object array.
 */
public class tShirtBox {

	public static void main(String[] args) {
		// variable declaration
		tShirt[] box = new tShirt[10];
		Scanner input = new Scanner(System.in);
		int choice = 0;

		// initializes t shirt objects in array
		for (int i = 0; i < box.length; i++) {
			box[i] = new tShirt();
		}
		for (int i = 0; i < box.length; i++) {
			System.out.println(box[i]);
		}
		menu();
		choice = input.nextInt();
		while (choice != 7) {
			if (choice == 1) { // sorts tshirts by colour using insertion sort
				insertionSort(box);
				for (int i = 0; i < box.length; i++) {
					System.out.println(box[i]);
				}
			} else if (choice == 2) { // sorts tshirts by size using selection sort
				selectionSort(box);
				for (int i = 0; i < box.length; i++) {
					System.out.println(box[i]);
				}
			} else if (choice == 3) { // sorts tshirts by design or not using bubble sort
				bubbleSort(box);
				for (int i = 0; i < box.length; i++) {
					System.out.println(box[i]);
				}
			} else if (choice == 4) { // finds tshirt based on matching colour and size using linear search
				System.out.println("Please enter shirt colour: ");
				String c1 = input.next();
				System.out.println("Please enter shirt size: ");
				int c2 = input.nextInt();
				findShirt(box, c1, c2);
			} else if (choice == 5) { // displays all t shirts w design using recursion
				int index = 0;
				shirtsWithDesign(box, index);
			} else if (choice == 6) { // Adds shirt to start of array
				System.out.println("1. Add Custom TShirt\n2. Add Random TShirt");
				choice = input.nextInt();
				if (choice == 1) {
					System.out.println("Please enter shirt colour: ");
					String c1 = input.next();
					System.out.println("Please enter shirt size: ");
					int c2 = input.nextInt();
					System.out.println("Design on shirt? Enter true or false.");
					boolean c3 = input.nextBoolean();
					tShirt additionalShirt = new tShirt(c1, c2, c3); // uses second constructor to create Tshirt w user
																		// values
					addShirt(box, additionalShirt);
				} else {
					tShirt additionalShirt = new tShirt();
					addShirt(box, additionalShirt);
				}
			}
			menu();
			choice = input.nextInt();
		}
		if (choice == 7) {
			System.out.println("Thank you. Goodbye");
		}
	}

	/**
	 * sorts array by colour 
	 * pre: none 
	 * post: array is sorted by colour.
	 */
	public static void insertionSort(tShirt[] arr) {
		int min_loc = 0;
		int place_at = 0;
		System.out.println("\nSorting Array(Insertion Sort)...");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < i && min_loc == 0; j++) {
				if (arr[i].getColour().charAt(0) > arr[j].getColour().charAt(0)) { // compares first letter of each
																					// colour
					min_loc = i;
					place_at = j;
				}
			}
			tShirt min_col = arr[min_loc]; // places lower char in correct spot
			for (int j = min_loc; j > place_at; j--) {
				arr[j] = arr[j - 1];

			}
			arr[place_at] = min_col;
			min_loc = 0;
			place_at = 0;

//			for (int k = 0; k < arr.length; k++) {
//			System.out.println(arr[k]);
//		}
		}
	}

	/**
	 * sorts array by size 
	 * pre: none 
	 * post: array is sorted by size in ascending order.
	 */
	public static void selectionSort(tShirt[] arr) {
		int maxNum = 0;
		int maxIndex = 0;
		tShirt temp;
		System.out.println("\nSorting Array(Selection Sort)...");
		for (int i = arr.length - 1; i >= 0; i--) { // sets last number as max num and index.
			maxNum = arr[i].getSize();
			maxIndex = i;
			for (int j = 0; j < i; j++) { // iterates through rest of array to find a size num greater than last num.
				if (arr[j].getSize() > maxNum) {
					maxNum = arr[j].getSize();
					maxIndex = j;
				}
				if (maxNum > arr[i].getSize()) { // swap
					temp = arr[i];
					arr[i] = arr[maxIndex];
					arr[maxIndex] = temp;

				}
			}
//			for (int k = 0; k < arr.length; k++) {
//				System.out.println(arr[k]);
//			}
		}
	}

	/**
	 * sorts array by whether or not there is a design on the shirt 
	 * pre: none 
	 * post: array is sorted so all shirts with designs are together and all shirts
	 * without are together.
	 */
	public static void bubbleSort(tShirt[] arr) {
		System.out.println("Sorting array(Bubble Sort)...");
		boolean isSwapped = true;
//		int iteration = 0;
		while (isSwapped) {
			isSwapped = false;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].isDesign() == false && arr[i + 1].isDesign() == true) {
					tShirt temp = arr[i];	//swaps if adjacent shirt does not have same design property
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSwapped = true; 
				}
			}
//			iteration++;
//			System.out.print("\nIteration " + iteration + " : ");
//			for (int k = 0; k < arr.length; k++) {
//			System.out.println(arr[k] + "\n");
//		}
		}
	}

	/**
	 * finds a shirt based on matching colour and size 
	 * pre: none 
	 * post: prints shirt with matching colour and size to inputted value
	 */
	public static void findShirt(tShirt[] arr, String c, int s) {
		System.out.println("Finding shirt...");
		for (int i = 0; i < arr.length; i++) {
			if (c.equals(arr[i].getColour()) && s == arr[i].getSize()) {
				System.out.println(arr[i]);
			}
		}

	}

	/**
	 * displays all shirts with a design 
	 * pre: none 
	 * post: shirts with a design are printed.
	 */
	public static tShirt[] shirtsWithDesign(tShirt[] arr, int index) {
		System.out.println("Displaying all Shirts with a Design...");
		if (index < arr.length) {
			if (arr[index].isDesign()) {
				System.out.println(arr[index]); // prints shirt if there is a design
			}
			return shirtsWithDesign(arr, (index + 1)); // recursively iterates through until all shirts with a design
														// are displayed
		}
		return null;
	}

	/**
	 * inserts a shirt created by the user into tshirt Array 
	 * pre: none 
	 * post: a shirt is added to the tShirt array.
	 */
	public static void addShirt(tShirt[] arr, tShirt shirt) {
		System.out.println("Adding a new shirt to start of box...");
		tShirt[] result = new tShirt[arr.length + 1]; // new array created with additional space for new shirt
		for (int j = arr.length - 1; j >= 0; j--) {
			result[j + 1] = arr[j]; // moves all elements in array one slot over
		}
		result[0] = shirt; // inserts shirt at the start of array
		for (int k = 0; k < result.length; k++) {
			System.out.println(result[k]);
		}
	}

	/**
	 * displays menu of options for user to choose from 
	 * pre: none 
	 * post: option menu is dislayed.
	 */
	public static void menu() {
		System.out.println("\n***OPTIONS DISPLAY***");
		System.out.println("1. Display the t-shirts sorted by colour" + "\n2. Display the t-shirts sorted by size"
				+ "\n3. Display the t-shirts sorted by having a design or not"
				+ "\n4. Find a t-shirt based on matching colour and size"
				+ "\n5. Display all the t-shirts that have a design"
				+ "\n6. Add a t-shirt to the box (at the start of the array)" + "\n7. Quit"
				+ "\n Enter your choice:  ");
	}
}
