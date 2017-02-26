package chess;

public class ChessModel implements IChessModel {

	/** a double array that stores all the pieces at their location on the 
	 * board */
	private IChessPiece[][] board;

	/** stores the current player */
	private Player player;

	/** sets board size to 8 */
	private final int BOARD_SIZE = 8;


	public ChessModel() {

	}
	public void reset() {

	}
	
	public boolean isValidMove(Move move) {
		return false;
	}

	public void promotion(Move move) {

	}
	
	public void move(Move move) {

	}

	public boolean inCheck(Player p) {
		return false;
	}
	public boolean isComplete(Player p) {
		return false;
	}

	public Player currentPlayer() {
		return player;
	}

	public int numRows() {
		return BOARD_SIZE;
	}

	public int numColumns() {
		return BOARD_SIZE;
	}
}
