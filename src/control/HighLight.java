package control;

import java.awt.Point;
import model.IChess;
import model.IPiece;
import view.IView;

public class HighLight implements ICommand {

  IChess m;
  IView v;
  Point pos;

  public HighLight(IChess m, IView v, Point p) {
    this.m = m;
    this.v = v;
    this.pos = p;
  }

  @Override
  public void goCommand(IChess model, IView view) {
    v.highLight(pos);
  }
}
