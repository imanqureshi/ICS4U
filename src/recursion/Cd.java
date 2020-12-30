package recursion;

import java.util.Random;

public class Cd {
	private static int numSongs;
	private static boolean favourite;
	private static String genre;

	public Cd() {
		numSongs = 0;
		favourite = false;
		genre = "";
	}

	public int getNumSongs() {
		return numSongs;
	}

	public void randNumSongs() {
		Random rand = new Random();
		int num;
		num = rand.nextInt(7) + 10;
		numSongs = num;
	}
	public void setNumSongs(int n) {
		numSongs = n;
	}

	public boolean getFavourite() {
		return favourite;
	}

	public void randFavourite() {
		Random rand = new Random();
		int num;
		num = rand.nextInt(2); // generating random choice for favourite or non favourite.
		if (num == 1) {
			favourite = false;
		} else {
			favourite = true;
		}
	}
	public void setFavourite(boolean f) {
		favourite = f;
	}

	public String getGenre() {
		return genre;
	}

	public void randGenre() {
		Random rand = new Random();
		int num = rand.nextInt(4);
		if (num == 0) {
			genre = "Pop";
		} else if (num == 1) {
			genre = "Rock";
		} else if (num == 2) {
			genre = "Country";
		} else
			genre = "Jazz";
	}
	public void setGenre(String g) {
		genre = g;
	}
	
	public String toString() {
		String info;
		info = "\n***CD INFO***";
		info += "\nGenre: " + genre;
		info += "\nNum of Songs: " + numSongs;
		if (favourite == false) {
			info += "\nFavourite?:  No\n";
		} else
			info += "\nFavourite?: Yes\n";
		return info;
	}
}
//
//	public static void bubbleSort(Cd[] arr) {
//		boolean isSwapped = true;
//		Cd temp;
//		for (int i = 0; i < arr.length - 1 && isSwapped; i++) {
//			isSwapped = false;
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j].getGenre().charAt(0) > (arr[j + 1].getGenre().charAt(0))) {
//					temp = arr[i];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//					isSwapped = true;
//				}
//			}
//		}
//		for (int k = 0; k < arr.length; k++) {
//			System.out.println(arr[k] + "\n");
//		}
//	}
//}