package chess;


import boardgame.Position;

public class ChessPosition {
    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column >'h' || row < 1 || row > 8){
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    //converte para a posição de matriz
    protected Position toPosition(){
        return new Position(8-row, column - 'a');
    }

    //converte para a posição do tabuleiro
    protected static ChessPosition fromPosition(Position pos){
        return new ChessPosition((char)('a' + pos.getColumns()),8 - pos.getRows());
    }

    @Override
    public String toString() {
        return ""+ column + row;
    }


}
