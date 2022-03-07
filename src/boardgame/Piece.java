package boardgame;

public class Piece {
	
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
	
}
