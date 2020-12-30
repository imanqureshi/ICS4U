package two2DArrays;
import java.util.Random;

public class PennyPrize {
	private String[][] board; 
	final static int SIZE = 5;
/**
 * constructor
 * pre:none
 * post:PennyPitch board is set to dimensions
 */
	public PennyPrize() {
		board = new String[SIZE][SIZE];
		/* creates an empty board */
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = "";
			}
		}
		fillBoard();
		//fills board w random prizes
	}
/**
 * Adds an item to the board in numPosition random places that have
 * not already been filled.
 * pre:the board contains empty strings: ""
 * post:an item has been added to numSpots random places on the board
 */
private void boardItem(String item, int numSpots) {
	Random rand = new Random();
	int spotRow, spotCol;
	int spotsFilled = 0;
	
	while (spotsFilled < numSpots) {
		spotRow = rand.nextInt(board.length);
		spotCol = rand.nextInt(board[0].length);
		if (board[spotRow][spotCol].equals("")) {
			board[spotRow][spotCol] = item;
			spotsFilled += 1;
		}
	}
}
/**
 * places the actual prizes and names on the board
 * pre:none
 * post: prizes are placed on board
 */
private void fillBoard() {
	boardItem("PUZZLE", 3);
	boardItem("DOLL", 3);
	boardItem("POSTER", 3);
	boardItem("GAME", 3);
	boardItem("BALL", 3);
	
}

public void printBoard() {
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board[0].length; j++) {
			System.out.format("%2s %8s %2s", "[", board[i][j], "]");
		}
		System.out.println();
	}
	System.out.println();
}


public void pennies() {
	Random rand = new Random();
	int spotRow, spotCol;
	
	for (int numPen = 1; numPen <= 10; numPen++) {
		spotRow = rand.nextInt(board.length);
		spotCol = rand.nextInt(board[0].length);
		board[spotRow][spotCol] += "X";
	}
}

private boolean winnerCheck(String item) {
	int numCovered = 0;
	
	for (int i = 0; i < board.length; i++) {
		for (int j = 0; j < board[0].length; j++) {
			if (board[i][j].endsWith(item + "X")) {
				numCovered += 1;
			}
		}
	}
	if (numCovered == 3) {
		return (true);
	} else {
		return (false);
	}
}

public void prizedisplay(){
	boolean prizeWon = false;
	
	System.out.println("Prize(s) won:");
	if (winnerCheck("PUZZLE")) {
		prizeWon = true;
		System.out.println("YOU WON A PUZZLE!");
	}
	if (winnerCheck("DOLL")) {
		prizeWon = true;
		System.out.println("YOU WON A DOLL!");
	}
	if (winnerCheck("POSTER")) {
		prizeWon = true;
		System.out.println("YOU WON A POSTER!");
	}
	if (winnerCheck("GAME")) {
		prizeWon = true;
		System.out.println("YOU WON A GAME!");
	}
	if (winnerCheck("BALL")) {
		prizeWon = true;
		System.out.println("YOU WON A BALL!");
	}
	if (!prizeWon) {
		System.out.println("Sorry, no prize won.");
	}
	
}

}
