package recursion;

public class Recur {
	public static void main(String[] args) {
	System.out.println(count8(88818));

	}

	public static int recur2(int n) {

		if (n == 1) {
			System.out.println(10);
			return 10;
		}
		int result = recur2(n - 1) + 3;
		System.out.println(result);
		return result;
	}

	public static int recur3(int n) {

		if (n == 1) {
			System.out.println(5);
			return 5;
		}
		int result = 3 * recur3(n - 1);
		System.out.println(result);
		return result;
	}

	public static int count7(int n) {
		int numOf7s = 0;
		if (n%10 == 7) {
			numOf7s++;
		} else if (n < 1) {
			return 0;
		}
		return numOf7s + count7(n/10);
	}
	public static int count8(int n) {
		int numOf8s = 0;
		if (n%10 == 8) {
			if ((n/10)%10 == 8) {
				numOf8s++;
			}
			numOf8s++;
		} else if (n < 1) {
			return 0;
		}
		return numOf8s + count8(n/10);
	}
}
