package chess;

public interface IChessPiece {

	/**
	 * Return the player that owns this piece.
	 *
	 * @return the player that owns this piece.
	 */
	Player player();

	/**
	 * Return the type of this piece ("King", "Queen", "Rook", etc.).
	 *
	 * @return the type of this piece
	 */
	String type();
	
	int getPieceWorth();

	/**
	 * Returns whether the piece at location {@code [move.fromRow, move.fromColumn]} is allowed to move to location
	 */
	boolean isValidMove(Move move, IChessPiece[][] board);
}
