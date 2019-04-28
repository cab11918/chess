package model;

import java.util.ArrayList;
import java.util.IllformedLocaleException;

public class ChessImpl implements IChess {

  private ArrayList<ArrayList<IPiece>> board;

  public ChessImpl() {
    board = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      ArrayList<IPiece> tmp = new ArrayList<>();
      for (int j = 0; j < 9; j++) {
        tmp.add(new Empty());
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
            board.get(i).set(j, new Che());

          }
          if (j == 1) {
            board.get(i).set(j, new Ma());

          }
          if (j == 2) {
            board.get(i).set(j, new Xiang());

          }
          if (j == 3) {
            board.get(i).set(j, new Shi());

          }
          if (j == 4) {
            board.get(i).set(j, new Jiang());

          }
          if (j == 5) {
            board.get(i).set(j, new Shi());

          }
          if (j == 6) {
            board.get(i).set(j, new Xiang());

          }
          if (j == 7) {
            board.get(i).set(j, new Ma());

          }
          if (j == 8) {

            board.get(i).set(j, new Che());

          }


        }
        if (i == 1) {
          board.get(i).set(j, new Empty());

        }
        if (i == 2) {
          if (j == 1 || j == 7) {
            board.get(i).set(j, new Pao());

          } else {
            board.get(i).set(j, new Empty());
          }
        }

        if (i == 3) {
          if (j == 0 || j == 2 || j == 4 || j == 6 || j == 8) {
            board.get(i).set(j, new Bing());

          } else {
            board.get(i).set(j, new Empty());

          }
        }
        if (i == 4) {
          board.get(i).set(j, new Empty());

        }
        if (i == 5) {
          board.get(i).set(j, new Empty());

        }
        if (i == 6) {
          if (j == 0 || j == 2 || j == 4 || j == 6 || j == 8) {
            board.get(i).set(j, new Bing());

          } else {
            board.get(i).set(j, new Empty());

          }
        }
        if (i == 7) {
          if (j == 1 || j == 7) {
            board.get(i).set(j, new Pao());

          } else {
            board.get(i).set(j, new Empty());
          }
        }
        if (i == 8) {
          board.get(i).set(j, new Empty());

        }
        if (i == 9) {

          if (j == 0) {
            board.get(i).set(j, new Che());

          }
          if (j == 1) {
            board.get(i).set(j, new Ma());

          }
          if (j == 2) {
            board.get(i).set(j, new Xiang());

          }
          if (j == 3) {
            board.get(i).set(j, new Shi());

          }
          if (j == 4) {
            board.get(i).set(j, new Jiang());

          }
          if (j == 5) {
            board.get(i).set(j, new Shi());

          }
          if (j == 6) {
            board.get(i).set(j, new Xiang());

          }
          if (j == 7) {
            board.get(i).set(j, new Ma());

          }
          if (j == 8) {

            board.get(i).set(j, new Che());


          }
        }
        // set side.
        if (i < 4) {
          board.get(i).get(j).setSide(0);
        } else {
          board.get(i).get(j).setSide(1);

        }
        //set pos.
        board.get(i).get(j).setPos(i,j);
      //  board.
      }

    }


  }

  @Override
  public ArrayList<ArrayList<IPiece>> getBoard() {
    return this.board;

  }
}
