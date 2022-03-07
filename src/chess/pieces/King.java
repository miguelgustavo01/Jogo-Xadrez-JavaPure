package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	//CONSTRUTOR
	
	public King(Board board, Color color) {
		super(board, color);
	}

	//TOSTRING
	
	@Override
	
	public String toString() {
		return "K";
	}
}
