package model;

import java.awt.*;

public class Xiang extends AbstractPiece {

    Xiang(Point p, int s) {
        this.pos = p;
        this.side =s;
    }
    @Override
    public String getName() {
        return "象";
    }


}
