package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {
	
	//CONSTRUTOR

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	
	//TOSTRING
	
	@Override
	public String toString() {
		return "R";
	}

}
