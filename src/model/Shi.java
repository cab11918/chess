package model;

import java.awt.*;

public class Shi extends AbstractPiece {


    Shi(Point p, int s) {
        this.pos = p;
        this.side =s;
    }
    @Override
    public String getName() {
        return "士";
    }


}
