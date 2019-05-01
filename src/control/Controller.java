package control;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.IChess;
import view.IView;

public class Controller implements IController, MouseListener {
  IChess model;
  IView view;
  int step = 0;
  Point from;


  public Controller(IChess model, IView view) {
    this.model = model;
    this.view = view;
    view.setMouseListener(this);
  }

  @Override
  public void go() {
    view.showIt();
  }

  @Override
  public void mouseClicked(MouseEvent e) {
    if(step % 2 == 0) {

      new HighLight(e.getPoint()).goCommand(model,view);
      this.from = e.getPoint();
      step++;
    }
    else if(step%2 == 1) {
      new Move(from,e.getPoint()).goCommand(model,view);
      step++;
    }

  }

  @Override
  public void mousePressed(MouseEvent e) {

  }

  @Override
  public void mouseReleased(MouseEvent e) {

  }

  @Override
  public void mouseEntered(MouseEvent e) {

  }

  @Override
  public void mouseExited(MouseEvent e) {

  }
}
