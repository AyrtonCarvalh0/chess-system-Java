package boardgame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        if(rows <1 || columns <1){
            throw new BoardException("Error creating a board: There must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece piece(int row, int column){
        if(!posExists(row , column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece (Position pos){
        if(!posExists(pos)){
            throw new BoardException("Position not on the board");
        }
        return pieces[pos.getRows()][pos.getColumns()];
    }

    public void placePiece(Piece piece, Position pos){
        //testa se ja existe uma peça nesta posiçao
        if (thereIsAPiece(pos)){
            throw new BoardException("There is already a piece on position "+pos);
        }
        pieces[pos.getRows()][pos.getColumns()] = piece;//pega a matriz na pos. dada e atribui a ela a peça que foi informada
        piece.position = pos;
    }
    //testa se as posições existem
    private boolean posExists(int row, int column){
           return row>=0 && row < rows && column >= 0 && column < columns;
    }

    public boolean posExists(Position pos){
        return posExists(pos.getRows(), pos.getColumns());
    }

    public boolean thereIsAPiece(Position pos){
        //testa se a posição existe
        if(!posExists(pos)){
            throw new BoardException("Position not on the board");
        }
        return piece(pos) != null;

    }
}
