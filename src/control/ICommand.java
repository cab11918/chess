package control;

import model.IChess;
import view.IView;

public interface ICommand {
  void goCommand(IChess model, IView view);

}
