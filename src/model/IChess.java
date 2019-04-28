package model;

import java.util.ArrayList;
import java.util.List;

public interface IChess {

    void initBoard();

    ArrayList<ArrayList<IPiece>> getBoard();
}
