package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
	
	//ATRIBUTOS
	
	private Color color;
	
	//CONSTRUTOR ARGUMENTOS
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	//GETTERS AND SETTERS
	
	public Color getColor() {
		return color;
	}

}
