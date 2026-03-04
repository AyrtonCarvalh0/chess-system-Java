package application;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch match = new ChessMatch();

        while (true) {
            UI.printBoard(match.getPieces());

            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UI.ReadChessPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UI.ReadChessPosition(sc);

            ChessPiece capturedPiece = match.performChessMove(source, target);

        }
    }
}