package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialsetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColums()];
		for (int i = 0; i < board.getColums(); i++) {
			for (int j = 0; j < board.getColums(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	private void initialsetup() {
		board.placePiece(new Rook(board,Color.WHITE), new Position(2,1));
		board.placePiece(new King(board,Color.BLACK) , new Position(0,4));
		board.placePiece(new King(board,Color.BLACK) , new Position(7,4));
	
	}

}