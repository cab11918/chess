package view;

import java.awt.Point;
import java.awt.event.MouseListener;
import java.lang.reflect.Array;
import java.net.http.WebSocket.Listener;
import java.util.ArrayList;

import model.ChessImpl;
import model.IChess;
import model.IPiece;

import javax.swing.*;

public interface IView {
    void showIt();

    void highLight(Point p);

    void setMouseListener(MouseListener l);

    JPanel getPanel();

    void setBoard(ArrayList<ArrayList<IPiece>> board);


}
