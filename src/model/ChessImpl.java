package model;

import java.awt.*;
import java.util.ArrayList;
import java.util.IllformedLocaleException;

public class ChessImpl implements IChess {

    private ArrayList<ArrayList<IPiece>> board;

    public ChessImpl() {
        board = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            ArrayList<IPiece> tmp = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                tmp.add(new Empty(new Point(i, j)));
            }
            board.add(tmp);
        }
        this.initBoard();

    }

    @Override
    public void initBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {

                if (i == 0) {
                    if (j == 0) {
                        board.get(i).set(j, new Che(new Point(i, j), 0));

                    }
                    if (j == 1) {
                        board.get(i).set(j, new Ma(new Point(i, j), 0));

                    }
                    if (j == 2) {
                        board.get(i).set(j, new Xiang(new Point(i, j), 0));

                    }
                    if (j == 3) {
                        board.get(i).set(j, new Shi(new Point(i, j), 0));

                    }
                    if (j == 4) {
                        board.get(i).set(j, new Jiang(new Point(i, j), 0));

                    }
                    if (j == 5) {
                        board.get(i).set(j, new Shi(new Point(i, j), 0));

                    }
                    if (j == 6) {
                        board.get(i).set(j, new Xiang(new Point(i, j), 0));

                    }
                    if (j == 7) {
                        board.get(i).set(j, new Ma(new Point(i, j), 0));

                    }
                    if (j == 8) {

                        board.get(i).set(j, new Che(new Point(i, j), 0));

                    }


                }
                if (i == 1) {
                    board.get(i).set(j, new Empty(new Point(i, j)));

                }
                if (i == 2) {
                    if (j == 1 || j == 7) {
                        board.get(i).set(j, new Pao(new Point(i, j), 0));

                    } else {
                        board.get(i).set(j, new Empty(new Point(i, j)));
                    }
                }

                if (i == 3) {
                    if (j == 0 || j == 2 || j == 4 || j == 6 || j == 8) {
                        board.get(i).set(j, new Bing(new Point(i, j), 0));

                    } else {
                        board.get(i).set(j, new Empty(new Point(i, j)));

                    }
                }
                if (i == 4) {
                    board.get(i).set(j, new Empty(new Point(i, j)));

                }
                if (i == 5) {
                    board.get(i).set(j, new Empty(new Point(i, j)));

                }
                if (i == 6) {
                    if (j == 0 || j == 2 || j == 4 || j == 6 || j == 8) {
                        board.get(i).set(j, new Bing(new Point(i, j), 1));

                    } else {
                        board.get(i).set(j, new Empty(new Point(i, j)));

                    }
                }
                if (i == 7) {
                    if (j == 1 || j == 7) {
                        board.get(i).set(j, new Pao(new Point(i, j), 1));

                    } else {
                        board.get(i).set(j, new Empty(new Point(i, j)));
                    }
                }
                if (i == 8) {
                    board.get(i).set(j, new Empty(new Point(i, j)));

                }
                if (i == 9) {

                    if (j == 0) {
                        board.get(i).set(j, new Che(new Point(i, j), 1));

                    }
                    if (j == 1) {
                        board.get(i).set(j, new Ma(new Point(i, j), 1));

                    }
                    if (j == 2) {
                        board.get(i).set(j, new Xiang(new Point(i, j), 1));

                    }
                    if (j == 3) {
                        board.get(i).set(j, new Shi(new Point(i, j), 1));

                    }
                    if (j == 4) {
                        board.get(i).set(j, new Jiang(new Point(i, j), 1));

                    }
                    if (j == 5) {
                        board.get(i).set(j, new Shi(new Point(i, j), 1));

                    }
                    if (j == 6) {
                        board.get(i).set(j, new Xiang(new Point(i, j), 1));

                    }
                    if (j == 7) {
                        board.get(i).set(j, new Ma(new Point(i, j), 1));

                    }
                    if (j == 8) {

                        board.get(i).set(j, new Che(new Point(i, j), 1));


                    }
                }
            }

        }


    }

    @Override
    public ArrayList<ArrayList<IPiece>> getBoard() {
        return this.board;

    }

    @Override
    public void move(int fromRow, int fromCol, int toRow, int toCol) {


        IPiece tmp = board.get(fromRow).get(fromCol);
        if (tmp.getName().equals("兵")) {

            if(fromRow<5) {
                if(toRow - fromRow == 1 && toCol - fromCol == 0) {
                    IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                    this.board.get(fromRow).set(fromCol, empty);
                    this.board.get(toRow).set(toCol, from);
                }

                if(fromRow>3){
                    if(toRow - fromRow == 1 && toCol - fromCol == 0 || (toRow - fromRow == 0 && toCol - fromCol == 1) || (toRow - fromRow == 0 && toCol - fromCol == -1)) {
                        IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                        IPiece empty = new Empty(new Point(fromRow, fromCol));

                        this.board.get(fromRow).set(fromCol, empty);
                        this.board.get(toRow).set(toCol, from);
                    }

                }
            }

        }

        if (tmp.getName().equals("车")) {
            IPiece from = new Che(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }

        if (tmp.getName().equals("将")) {
            IPiece from = new Jiang(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }

        if (tmp.getName().equals("马")) {
            IPiece from = new Ma(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }

        if (tmp.getName().equals("炮")) {
            IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }

        if (tmp.getName().equals("士")) {
            IPiece from = new Shi(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }

        if (tmp.getName().equals("象")) {
            IPiece from = new Xiang(new Point(toRow, toCol), tmp.getSide());
            IPiece empty = new Empty(new Point(fromRow, fromCol));

            this.board.get(fromRow).set(fromCol, empty);
            this.board.get(toRow).set(toCol, from);
        }


    }

    @Override
    public IPiece getPiece(int x, int y) {
        return board.get(x).get(y);
    }


}
