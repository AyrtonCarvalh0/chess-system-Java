package boardgame;

import chess.ChessPiece;
import chess.Color;

public abstract class Piece {
    protected Position position;
    private Board board;
    private Color color;

    public Piece(Board board) {
        this.board = board;
        position = null;
    }
    protected Board getBoard() {
        return board;
    }
    public abstract boolean[][] possibleMoves();

    public boolean possibleMove(Position pos){
        return possibleMoves()[pos.getRows()][pos.getColumns()];
    }

    public boolean isThereAnyPossibleMove(){
        boolean[][] mat = possibleMoves();
        for ( int i=0; i< mat.length; i++){
            for(int j=0; j< mat.length; j++){
                if(mat[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    protected boolean IsThereOpponetPiece(Position pos){
        ChessPiece p = (ChessPiece) getBoard().piece(pos);
        return p != null && p.getColor() != color;
    }

}
