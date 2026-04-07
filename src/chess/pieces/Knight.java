package chess.pieces;

import boardgame.Position;
import chess.ChessPiece;

public class Knight extends ChessPiece {

    public Knight(boardgame.Board board, chess.Color color) {
        super(board, color);
    }

    public String toString(){
        return "N";
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat =  new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0,0);


        p.setValues(position.getRows()-1, position.getColumns()-2);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()-2, position.getColumns()-1);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()-2, position.getColumns()+1);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()-1, position.getColumns()+2);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()+1, position.getColumns()+2);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()+2, position.getColumns()+1);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()+2, position.getColumns()-1);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        p.setValues(position.getRows()+1, position.getColumns()-2);

        if (getBoard().posExists(p) && canMove(p)){
            mat[p.getRows()][p.getColumns()] = true;
        }


        return mat;
    }
}
