package chess.pieces;

import boardGame.Board;
import chess.ChessPiece;
import chess.Color;

import java.util.Scanner;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

}
