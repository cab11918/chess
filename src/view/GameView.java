package view;

import java.awt.event.MouseListener;
import java.net.http.WebSocket.Listener;
import model.ChessImpl;
import model.IChess;
import model.IPiece;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class GameView extends JFrame implements IView {

  ChessPanel panel;



  public GameView(IChess model) {
    super();
    this.setTitle("中国象棋");
    this.setSize(550, 500);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);






    this.panel = new ChessPanel(model.getBoard());
    this.add(panel);






  }

  @Override
  public void showIt() {
    this.setVisible(true);

  }

  @Override
  public void highLight(Point p) {



//    throw new IllegalArgumentException( (p.x - p.x % 50)/50 + " , " +((p.y-p.y%50)/50) + " Selected" );

    this.panel.highLight(p);
  }

  @Override
  public void setMouseListener(MouseListener l) {
    this.panel.addMouseListener(l);
  }

  @Override
  public JPanel getPanel() {
    return this.panel;
  }

  @Override
  public void setBoard(ArrayList<ArrayList<IPiece>> board) {
    this.panel.pieces = board;
  }




}
