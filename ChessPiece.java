package chess;

public abstract class ChessPiece implements IChessPiece {

	private Player owner;
	
	protected ChessPiece(Player player) {
		this.owner = player;
	}
	
	public abstract String type();
	
	@Override
	public Player player() {
		return owner;
	}
	
	public abstract int getPieceWorth();

	@Override
	public boolean isValidMove(Move move, IChessPiece[][] board) {
		if (board[move.toRow][move.toColumn] != null) {
			if (move.fromRow != move.toRow || move.fromColumn != move.toColumn)
				if (board[move.fromRow][move.fromColumn].player() == owner)
					if (board[move.toRow][move.toColumn].player() != owner)
						return true; 
		}
		else 
			if (move.fromRow != move.toRow || move.fromColumn != move.toColumn)
				return true;
		return false;
	}
}
