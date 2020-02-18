package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	//Protected pois ele é de uso interno da camada de tabuleiro, não sendo visivel na camada de xadrez
	protected Board getBoard() {
		return board;
	}
	
	
}
