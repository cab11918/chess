import control.Controller;
import control.IController;
import model.ChessImpl;
import model.IChess;
import view.GameView;
import view.IView;

public class Main {

    public static void main(String[] args) {
        IChess model = new ChessImpl();

        IView view = new GameView(model);
        IController ctrl = new Controller(model,view);
        ctrl.go();

     //  throw new IllegalArgumentException("" + model.getBoard().get(5).get(0).getSide());
    }
}
