package chess;

public interface IChessModel {

	/**
	 * Returns whether the game is complete.
	 *
	 * @return
	 */
	boolean isComplete(Player p);

	/**
	 * Returns whether the piece at location [move.fromRow, move.fromColumn] is allowed to move to location
	 * [move.fromRow, move.fromColumn]
	 */
	boolean isValidMove(Move move);

	/**
	 * Moves the piece from location [move.fromRow, move.fromColumn] to location [move.fromRow,
	 * move.fromColumn].
	 *
	 */
	void move(Move move);

	/**
	 * Report whether the current player p is in check.
	 */
	boolean inCheck(Player p);

	/**
	 * Return the current player.
	 *
	 * @return the current player
	 */
	Player currentPlayer();
	
}
