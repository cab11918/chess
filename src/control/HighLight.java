package control;

import java.awt.Point;
import model.IChess;
import model.IPiece;
import view.IView;

public class HighLight implements ICommand {


  Point pos;

  public HighLight(Point p) {
    this.pos = p;
  }

  @Override
  public void goCommand(IChess model, IView view) {
    view.highLight(pos);
  }
}
