package boardgame;

public abstract class Piece {
	
	//ATRIBUTOS
	
	protected Position position;
	private Board board;
	
	//CONSTRUTOR ARGUMENTOS
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//GETTERS AND SETTERS
	
	protected Board getBoard() {
		return board;
	}
	
	//METODOS
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThrereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length;i++) {
			for (int j=0; j<mat.length;j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
