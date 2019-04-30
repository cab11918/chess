package model;

import java.awt.Point;

public interface IPiece {

  String getName();

  void setSide(int s);

  int getSide();

  void setPos(int x, int y);


  Point getPos();

}
