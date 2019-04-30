package model;

import java.util.ArrayList;
import java.util.List;

public interface IChess {

    void initBoard();

    ArrayList<ArrayList<IPiece>> getBoard();

    void move(int fromRow, int fromCol, int toRow, int toCol);

    IPiece getPiece(int x, int y);

}
