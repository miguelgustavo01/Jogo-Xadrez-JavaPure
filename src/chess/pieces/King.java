package chess.pieces;

import boardgame.Board;
import boardgame.Position;
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
	
	private boolean canMove(Position position) {
		ChessPiece p= (ChessPiece)getBoard().piece(position);
		return p == null || p.getColor() != getColor();
 	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0,0);
		
		//ACIMA
		p.setValues(position.getRow() -1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//ABAIXO
		p.setValues(position.getRow() +1, position.getColumn());
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//ESQUERDA
		p.setValues(position.getRow(), position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//DIREITA
		p.setValues(position.getRow(), position.getColumn() +1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//DIAGONAL ESQUERDA
		p.setValues(position.getRow()-1, position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//DIAGONAL DIREITA
		p.setValues(position.getRow()-1, position.getColumn() +1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//DIAGONAL ABAIXO ESQUERDA
		p.setValues(position.getRow()+1, position.getColumn() -1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		//DIAGONAL ABAIXO DIREITA
		p.setValues(position.getRow()+1, position.getColumn() +1);
		if (getBoard().positionExists(p) && canMove(p)) {
			mat[p.getRow()] [p.getColumn()] = true;
		}
		
		
		return mat;
	}
}
