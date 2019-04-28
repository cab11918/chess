package control;

import java.awt.Point;
import model.IChess;
import view.IView;

public class Move implements ICommand {
  Point from;
  Point to;

  public Move(Point from,Point to) {
    this.from = from;
    this.to = to;
  }

  @Override
  public void goCommand(IChess model, IView view) {
    model.getBoard().get((from.x-from.x%50)/50).get((from.y-from.y%50)/50).setPos((to.x - to.x % 50)/50,(to.y-to.y%50)/50);
    view.getPanel().repaint();
  }
}
