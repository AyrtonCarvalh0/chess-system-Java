package application;

import boardgame.Board;
import chess.ChessMatch;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class program {
    public static void main(String[] args) {
        ChessMatch match = new ChessMatch();
        UI.printBoard(match.getPieces());
    }
}