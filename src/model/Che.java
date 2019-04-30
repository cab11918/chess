package model;

import java.awt.*;

public class Che extends AbstractPiece {


    Che(Point p, int s) {
        this.pos = p;
        this.side =s;
    }
    @Override
    public String getName() {
        return "车";
    }


}
