package chess;

import boardgame.Position;

public class ChessPosition {
	
	private char column;
	private int row;
	
	//CONSTRUTOR ARGUMENTOS
	
	public ChessPosition(char column, int row) {
		
		if(column < 'a' || column > 'h'|| row < 1 || row > 8) {
			throw new ChessException("Erro ao declarar posicao do xadrez, valorez validos de a1 ate h8");
		}
		
		this.column = column;
		this.row = row;
	}
	
	//GETTERS AND SETTERS

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	//METODOS
	
	 protected Position toPosition() {
		 return new Position(8 - row, column - 'a');
	 }
	
	 protected static ChessPosition fromPosition(Position position) {
		 return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
	 }
	 
	 //TOSTRING
	 
	 @Override
	 public String toString() {
		return "" + column + row;
	 }

}
