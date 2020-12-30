package recursion;

import java.util.Scanner;

public class Recursion {

	public static void recursionOne(int n) {
		if (n < 1) {
			System.out.println("Done!");
		} else {
			System.out.println("Term: " + n + " = " + (2 * n + 1));
			n--;
			recursionOne(n);
		}
	}

	public static void recursionTwo(int n) {
		if (n < 1) {
			System.out.println("Done!");
		} else {
			System.out.println("Term: " + n + " = " + (2));
			n--;
		}
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else
			return n * factorial(n - 1);

	}

	public static int fib(int n) {
		if (n <= 1) {
			return 1;
		} else
			return fib(n - 1) + (fib(n - 2));

	}

	public static int sum(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n + sum(n - 1);
		}
	}

	public static int result(int n) {
		if (n == 1) {
			return 2;
		} else {
			return 2 * result(n - 1);
		}
	}

	public static int mystery(int n, int a, int d) {
		if (n == 1) {
			return a;
		} else {
			return d + mystery(n - 1, a, d);
		}
	}

	public static int f(int k, int n) {
		if (n == k) {
			return k;
		} else {
			if (n > k)
				return f(k, n - k);
			else
				return f(k - n, n);
		}
	}

	public static void strRecur(String s) {
		if (s.length() < 6) {
			System.out.println(s);
			strRecur(s + "*");
		}
	}

	public static void printString(String s) {
		if (s.length() > 0) {
			printString(s.substring(1));
			System.out.print(s.substring(0, 1));
		}
	}

	public static void doSomething(int n) {
		if (n > 0) {
			doSomething(n - 1);
			System.out.print(n);
			doSomething(n - 1);
		}
	}

	public static void recur1(int n) {
		if (n > 0) {
			recur1(n - 2);
		}
		System.out.print(n + " ");
	}

	public static void recur2(int n) {
		if (n > 0) {
			recur2(n - 1);
			for (int i = 0; i < n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void recur3(int n) {
		if (n > 0) {
			recur3(n - 10);
		}
		System.out.println(n + " ");
	}

	public static int recur(int n) {

		if (n == 1) {

			System.out.println(2);

			return 2;

		}

		int result = n + recur(n - 1);

		System.out.println(result);

		return result;

	}

	public static int fibonacciSequence(int n) {

		if (n == 1) {
//			System.out.println(n);
			return 1;

		} else if (n == 2) {
//			System.out.println(n);
			return 2;

		}
		int result = fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
//		System.out.println(sum(5));
//		System.out.println(result(5));
//		System.out.println(mystery(3, 2, 6));
//		System.out.println(f(6, 8));
////		doSomething(3);
//		recur2(6);
//		recur3(26);
		recur(5);
		fibonacciSequence(6);

//		int num;
//		Scanner input = new Scanner(System.in);
//		do {
//			System.out.println("Please enter a factorial number.");
//			num = input.nextInt();
//		} while (num <= 0);
//		System.out.println(factorial(num));
//	}
	}

}
