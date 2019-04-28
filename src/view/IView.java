package view;

import java.awt.Point;
import java.awt.event.MouseListener;
import java.net.http.WebSocket.Listener;
import model.ChessImpl;
import model.IChess;

import javax.swing.*;

public interface IView {
    void showIt();

    void highLight(Point p);

    void setMouseListener(MouseListener l);

    JPanel getPanel();
}
