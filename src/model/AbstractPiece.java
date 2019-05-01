package model;

import java.awt.Point;

public abstract class AbstractPiece implements IPiece {
protected Point pos;
protected int side;

  public abstract String getName();


  @Override
  public void setSide(int s) {
    if(s==0||s==1 && !this.getName().equals("")) {
      this.side = s;
    }else {
      this.side = 999;
    }

  }

  @Override
  public int getSide() {
    return this.side;
  }

  @Override
  public void setPos(int x, int y) {
this.pos = new Point(x,y);
  }

  @Override
  public void move(int fromRow,int fromCol, int toRow, int toCol) {
    this.setPos(toRow,toCol);
  }
  @Override
  public Point getPos() {
    return this.pos;
  }
}
