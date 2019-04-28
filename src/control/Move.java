package control;

import java.awt.Point;
import model.IChess;
import model.IPiece;
import view.IView;

public class Move implements ICommand {
  IPiece from;
  Point to;

  public Move(IPiece from, Point to) {
    this.from = from;
    this.to = to;
  }

  @Override
  public void goCommand(IChess model, IView view) {

  }
}
