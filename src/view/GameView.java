package view;

import model.ChessImpl;
import model.IChess;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame implements IView {

    ChessPanel panel;


    public GameView(IChess model) {
        super();
        this.setTitle("中国象棋");
        this.setSize(950, 1150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        this.panel = new ChessPanel(model.getBoard());
this.add(panel);
    }

    @Override
    public void showIt() {
        this.setVisible(true);

    }
}
