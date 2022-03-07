package boardgame;

public class Position {

	//ATRIBUTOS
	
	private int row;
	private int column;
	
	//CONSTRUTOR ARGUMENTOS	
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//GETTERS AND SETTERS

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	//TO STRING
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
	
	
	
	
	
	
	
	
	
}
