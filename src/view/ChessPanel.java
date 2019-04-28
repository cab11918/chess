package view;

import model.IPiece;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChessPanel extends JPanel {

  ArrayList<ArrayList<IPiece>> pieces;

  ChessPanel(ArrayList<ArrayList<IPiece>> pieces
  ) {
    super();
    this.pieces = pieces;
  }

  @Override
  public void paint(Graphics g) {
    super.paintComponent(g);

    this.drawPiece(g);

  }

  public void drawPiece(Graphics g) {
    g.setFont(new Font("Arial", Font.PLAIN, 20));
    g.setColor(Color.black);
    g.drawPolyline(new int[]{25, 125, 25, 125, 375, 475, 375, 475},
        new int[]{175, 275, 275, 175, 175, 275
            , 275, 175}, 8);
    g.setColor(Color.cyan);

    g.fillRect(225, 25, 50, 400);

    for (int i = 0; i < pieces.size(); i++) {
      for (int j = 0; j < pieces.get(i).size(); j++) {

        IPiece tmp = pieces.get(i).get(j);
        if (i > 4) {
          if (!tmp.getName().equals("")) {
            g.setColor(Color.BLUE);
            g.fillOval(tmp.getPos().x * 50 + 5, tmp.getPos().y * 50 + 5, 40, 40);
          }
          g.setColor(Color.BLACK);

          if (i != 9 && j != 8 && i != 4) {
            g.drawRect(i * 50 + 25, j * 50 + 25, 50, 50);
          }

          g.setColor(Color.WHITE);

          g.drawString(tmp.getName(), tmp.getPos().x * 50 + 16, tmp.getPos().y * 50 + 32);
        } else {
          if (!tmp.getName().equals("")) {
            g.setColor(Color.RED);

            g.fillOval(tmp.getPos().x * 50 + 5, tmp.getPos().y * 50 + 5, 40, 40);
          }
          g.setColor(Color.BLACK);
          if (i != 9 && j != 8 && i != 4) {
            g.drawRect(i * 50 + 25, j * 50 + 25, 50, 50);
          }
          g.setColor(Color.WHITE);

          g.drawString(tmp.getName(), tmp.getPos().x * 50 + 16, tmp.getPos().y * 50 + 32);
        }


      }
    }


  }

  public void highLight(Point p) {

    getGraphics().fillRoundRect(p.x - p.x % 50, p.y - p.y % 50, 50, 50,10,10);
  }


}
