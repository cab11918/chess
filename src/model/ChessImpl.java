package model;

import java.awt.*;
import java.util.ArrayList;

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

        boolean horVer = (fromRow - toRow == 0 && !(fromCol - toCol == 0)) || (fromCol - toCol == 0 && !(fromRow - toRow == 0));

        IPiece tmp = board.get(fromRow).get(fromCol);
        if (tmp.getSide() != 999 && board.get(toRow).get(toCol).getSide() != tmp.getSide()) {
            if (tmp.getName().equals("兵")) {
                if (tmp.getSide() == 0) {
                    if (fromRow < 5) {
                        if (toRow - fromRow == 1 && toCol - fromCol == 0) {
                            IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                            IPiece empty = new Empty(new Point(fromRow, fromCol));

                            this.board.get(fromRow).set(fromCol, empty);
                            this.board.get(toRow).set(toCol, from);
                        }
                    }


                    if (fromRow > 4) {
                        if (toRow - fromRow == 1 && toCol - fromCol == 0 || (toRow - fromRow == 0 && toCol - fromCol == 1) || (toRow - fromRow == 0 && toCol - fromCol == -1)) {
                            IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                            IPiece empty = new Empty(new Point(fromRow, fromCol));

                            this.board.get(fromRow).set(fromCol, empty);
                            this.board.get(toRow).set(toCol, from);

                        }

                    }
                }

                if (tmp.getSide() == 1) {
                    if (fromRow > 4) {
                        if (toRow - fromRow == -1 && toCol - fromCol == 0) {
                            IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                            IPiece empty = new Empty(new Point(fromRow, fromCol));

                            this.board.get(fromRow).set(fromCol, empty);
                            this.board.get(toRow).set(toCol, from);
                        }
                    }


                    if (fromRow < 5) {
                        if (toRow - fromRow == -1 && toCol - fromCol == 0 || (toRow - fromRow == 0 && toCol - fromCol == 1) || (toRow - fromRow == 0 && toCol - fromCol == -1)) {
                            IPiece from = new Bing(new Point(toRow, toCol), tmp.getSide());
                            IPiece empty = new Empty(new Point(fromRow, fromCol));

                            this.board.get(fromRow).set(fromCol, empty);
                            this.board.get(toRow).set(toCol, from);

                        }

                    }
                }

            } else {
                if (tmp.getName().equals("车")) {
                    Boolean canMoveHor = true;
                    Boolean canMoveVer = true;


                    if (horVer) {
                        if (fromRow - toRow != 0) {
                            int bigger = Math.max(fromRow, toRow);
                            int smaller = Math.min(fromRow, toRow);
                            for (int i = smaller + 1; i < bigger; i++) {
                                if (!board.get(i).get(fromCol).getName().equals("")) {
                                    canMoveHor = false;
                                    break;

                                }

                            }
                            if (canMoveHor) {
                                IPiece from = new Che(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));

                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                            if (Math.abs(fromRow - toRow) == 1 && board.get(toRow).get(toCol).getName().equals("")) {
                                IPiece from = new Che(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));

                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }


                        }

                        if (fromCol - toCol != 0) {
                            int bigger = Math.max(fromCol, toCol);
                            int smaller = Math.min(fromCol, toCol);
                            for (int i = smaller + 1; i < bigger; i++) {
                                if (!board.get(fromRow).get(i).getName().equals("")) {
                                    canMoveVer = false;
                                    break;

                                }

                            }
                            if (canMoveVer) {
                                IPiece from = new Che(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));

                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }


                        }


                    }


                } else if (tmp.getName().equals("将")) {
                    int bigger = Math.max(fromRow, toRow);
                    int smaller = Math.min(fromRow, toRow);
                    Boolean canEat = true;


                    if (fromCol - toCol == 0) {
                        if (board.get(toRow).get(toCol).getName().equals("将")) {
                            for (int i = smaller + 1; i < bigger; i++) {
                                if (!board.get(i).get(fromCol).getName().equals("")) {
                                    canEat = false;
                                    break;

                                }

                            }
                            if (canEat) {
                                IPiece from = new Jiang(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }
                    }


                    if (tmp.getSide() == 0) {
                        if (horVer) {
                            if (Math.abs(fromRow - toRow) == 1 || Math.abs(fromCol - toCol) == 1) {
                                if (toCol > 2 && toCol < 6 && toRow > -1 && toRow < 3) {
                                    IPiece from = new Jiang(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));
                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }
                            }
                        }

                    }
                    if (tmp.getSide() == 1) {
                        if (horVer) {
                            if (Math.abs(fromRow - toRow) == 1 || Math.abs(fromCol - toCol) == 1) {
                                if (toCol > 2 && toCol < 6 && toRow > 6 && toRow < 10) {
                                    IPiece from = new Jiang(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));
                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }
                            }

                        }
                    }

                } else if (tmp.getName().equals("马")) {
                    int bigRow = Math.max(fromRow, toRow);
                    int smallRow = Math.min(fromRow, toRow);
                    int bigCol = Math.max(fromCol, toCol);
                    int smallCol = Math.min(fromCol, toCol);
                    if (bigRow - smallRow == 2 && bigCol - smallCol == 1) {
                        if (fromRow < toRow) {
                            if (board.get(fromRow + 1).get(fromCol).getName().equals("")) {


                                IPiece from = new Ma(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        } else {
                            if (board.get(fromRow - 1).get(fromCol).getName().equals("")) {


                                IPiece from = new Ma(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }


                    }

                    if (bigRow - smallRow == 1 && bigCol - smallCol == 2) {
                        if (fromCol > toCol) {
                            if (board.get(fromRow).get(fromCol - 1).getName().equals("")) {


                                IPiece from = new Ma(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        } else {
                            if (board.get(fromRow).get(fromCol + 1).getName().equals("")) {


                                IPiece from = new Ma(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }
                    }

                } else if (tmp.getName().equals("炮")) {

                    if (!board.get(toRow).get(toCol).getName().equals("")) {

                        Boolean canEatHor = false;
                        Boolean canEatVer = false;


                        if (horVer) {
                            if (fromRow - toRow != 0) {
                                int betweenHor = 0;
                                int bigger = Math.max(fromRow, toRow);
                                int smaller = Math.min(fromRow, toRow);
                                for (int i = smaller + 1; i < bigger; i++) {
                                    if (!board.get(i).get(fromCol).getName().equals("")) {
                                        betweenHor++;

                                    }

                                }
                                if (betweenHor == 1) {
                                    canEatHor = true;
                                }
                                if (canEatHor) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }
                                if (Math.abs(fromRow - toRow) == 1 && board.get(toRow).get(toCol).getName().equals("")) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }


                            }

                            if (fromCol - toCol != 0) {
                                int betweenVer = 0;
                                int bigger = Math.max(fromCol, toCol);
                                int smaller = Math.min(fromCol, toCol);
                                for (int i = smaller + 1; i < bigger; i++) {
                                    if (!board.get(fromRow).get(i).getName().equals("")) {
                                        betweenVer++;

                                    }

                                }
                                if (betweenVer == 1) {
                                    canEatVer = true;
                                }
                                if (canEatVer) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }


                            }


                        }

                    } else {
                        Boolean canMoveHor = true;
                        Boolean canMoveVer = true;


                        if (horVer) {
                            if (fromRow - toRow != 0) {
                                int bigger = Math.max(fromRow, toRow);
                                int smaller = Math.min(fromRow, toRow);
                                for (int i = smaller + 1; i < bigger; i++) {
                                    if (!board.get(i).get(fromCol).getName().equals("")) {
                                        canMoveHor = false;
                                        break;

                                    }

                                }
                                if (canMoveHor) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }
                                if (Math.abs(fromRow - toRow) == 1 && board.get(toRow).get(toCol).getName().equals("")) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }


                            }

                            if (fromCol - toCol != 0) {
                                int bigger = Math.max(fromCol, toCol);
                                int smaller = Math.min(fromCol, toCol);
                                for (int i = smaller + 1; i < bigger; i++) {
                                    if (!board.get(fromRow).get(i).getName().equals("")) {
                                        canMoveVer = false;
                                        break;

                                    }

                                }
                                if (canMoveVer) {
                                    IPiece from = new Pao(new Point(toRow, toCol), tmp.getSide());
                                    IPiece empty = new Empty(new Point(fromRow, fromCol));

                                    this.board.get(fromRow).set(fromCol, empty);
                                    this.board.get(toRow).set(toCol, from);
                                }


                            }


                        }
                    }


                } else if (tmp.getName().equals("士")) {


                    if (tmp.getSide() == 0) {

                        if (Math.abs(fromRow - toRow) == 1 && Math.abs(fromCol - toCol) == 1) {
                            if (toCol > 2 && toCol < 6 && toRow > -1 && toRow < 3) {
                                IPiece from = new Shi(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }


                    }
                    if (tmp.getSide() == 1) {

                        if (Math.abs(fromRow - toRow) == 1 && Math.abs(fromCol - toCol) == 1) {
                            if (toCol > 2 && toCol < 6 && toRow > 6 && toRow < 10) {
                                IPiece from = new Shi(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }


                    }
                } else if (tmp.getName().equals("象")) {
                    int bigRow = Math.max(fromRow, toRow);
                    int smallRow = Math.min(fromRow, toRow);
                    int bigCol = Math.max(fromCol, toCol);
                    int smallCol = Math.min(fromCol, toCol);
                    if (bigRow - smallRow == 2 && bigCol - smallCol == 2) {
                        if (fromRow < toRow && fromCol > toCol) {
                            if (board.get(fromRow + 1).get(fromCol - 1).getName().equals("")) {


                                IPiece from = new Xiang(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }

                        if (fromRow < toRow && fromCol < toCol) {
                            if (board.get(fromRow + 1).get(fromCol + 1).getName().equals("")) {


                                IPiece from = new Xiang(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }

                        if (fromRow > toRow && fromCol < toCol) {
                            if (board.get(fromRow - 1).get(fromCol + 1).getName().equals("")) {


                                IPiece from = new Xiang(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }

                        if (fromRow > toRow && fromCol > toCol) {
                            if (board.get(fromRow - 1).get(fromCol - 1).getName().equals("")) {


                                IPiece from = new Xiang(new Point(toRow, toCol), tmp.getSide());
                                IPiece empty = new Empty(new Point(fromRow, fromCol));
                                this.board.get(fromRow).set(fromCol, empty);
                                this.board.get(toRow).set(toCol, from);
                            }
                        }


                    }

                }
            }
        }


    }

    @Override
    public IPiece getPiece(int x, int y) {
        return board.get(x).get(y);
    }


}
