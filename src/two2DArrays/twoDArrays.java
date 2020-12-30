package two2DArrays;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Date: October 1 2020 
 * Author: Iman Qureshi 
 * ICS4U 
 * This program is designed to display 2 2D arrays created by the user 
 * and multiply them together to create a new matrix from the products the matrices.
 */
public class twoDArrays {
	private static int matrixNum = 1;
	final static int SIZE = 4;
	private static Scanner scanner;

	/**
	 * The main method is responsible for displaying the program. 
	 * pre:none.
	 * post:program is displayed to the user.
	 */
	public static void main(String[] args) {
		int[][] numbers1;
		int[][] numbers2;
		numbers1 = new int[SIZE][SIZE];
		numbers2 = new int[SIZE][SIZE];
		scanner = new Scanner(System.in);

		System.out.println(
				"Hello! Welcome to the two 2D Array program! You will be creating two 4x4 matrices. Let's begin!\n");
		ReadTwoDimArray(numbers1);
		ReadTwoDimArray(numbers2);
		System.out.println("Here are your 2 matrices:");
		System.out.println("Matrix 1:");
		printMatrix(numbers1);
		System.out.println("Matrix 2:");
		printMatrix(numbers2);

		int[][] result = new int[SIZE][SIZE];
		MultiplicationTwoDim(numbers1, numbers2, result);
		System.out.println("The product of the two matrices as another matrix is:");
		printMatrix(result);
		System.out.println("\nThis is the end of your activity. Thank you!");
		scanner.close();
	}

	/**
	 * Allows the user to input 2 two-dimensional arrays 4x4 named numbers1 and
	 * numbers2. Calls on fillmatrix method to do so.
	 * pre:none. 
	 * post:both Matrices are filled with integer elements.
	 */
	public static void ReadTwoDimArray(int[][] numbers) {
		System.out.println("Please fill in matrix number " + matrixNum + ":");
		fillMatrix(numbers);
		matrixNum++;
	}

	/**
	 * Fills matrix with integer elements.
	 * pre:none. 
	 * post:matrix is filled with integer elements.
	 */
	public static void fillMatrix(int[][] matrix) {
		for (int i = 0; i < SIZE; i++) {
			System.out.println("You are now filling row: " + (i + 1));
			for (int j = 0; j < SIZE; j++) {
				System.out.println("Please enter element number " + (j + 1) + ": ");
				matrix[i][j] = scanner.nextInt();
			}
			if (i < SIZE - 1)
				System.out.println("Moving onto the next row!");
		}
	}

	/**
	 * Allows matrix to be printed. 
	 * pre:none.
	 * post:matrix is printed.
	 */
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	/**
	 * Calculates the matrix sum of the two matrices by adding the elements on the same position. 
	 * pre:none. 
	 * post:both Matrices are multiplied and represented as one matrix.
	 */
	public static void MultiplicationTwoDim(int[][] numbers1, int[][] numbers2, int[][] numbersOut) {
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				for (int k = 0; k < SIZE; k++) {
					numbersOut[i][j] += numbers1[i][k] * numbers2[k][j];
				}
			}
		}
	}
}
