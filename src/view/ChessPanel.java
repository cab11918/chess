package view;

import model.IChess;
import model.IPiece;
import model.Slot;
import model.Xiang;

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
        for (ArrayList<IPiece> row : pieces) {
            for (IPiece p : row) {
                this.drawPiece(p, g);
            }


        }
    }

    public void drawPiece(IPiece p, Graphics g) {
        for (int i = 0; i < pieces.size(); i++) {
            for (int j = 0; j < pieces.get(i).size(); j++) {
                g.drawString(pieces.get(i).get(j).getName(), i * 80+50, j * 80+50);


            }
        }

    }

}
