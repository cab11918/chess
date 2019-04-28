import model.ChessImpl;
import model.IChess;
import view.GameView;
import view.IView;

public class Main {

    public static void main(String[] args) {
        IChess model = new ChessImpl();

        IView view = new GameView(model);
        view.showIt();
    }
}
