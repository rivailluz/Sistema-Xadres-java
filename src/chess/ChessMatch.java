package chess;

import boardgame.Board;
import boardgame.Position;
import chess.piece.King;
import chess.piece.Rook;

public class ChessMatch {
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }
    
    public ChessPiece[][] getPiece(){
        ChessPiece [][] aux = new ChessPiece[board.getRows()][board.getColumns()];
        
        for(int i=0 ; i < board.getRows(); i++){
            for(int j=0 ; j< board.getColumns(); j ++){
                aux[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return aux;
    }
    
    private void placeNewPiece(char column,int row, ChessPiece piece){
        board.placePiece(piece , new ChessPosition(column,row).toPosition());
    }
    
    public void initialSetup(){
        placeNewPiece('a',1, new King(Color.BLACK, board));
    }
}
