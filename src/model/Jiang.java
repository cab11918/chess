package model;

import java.awt.*;

public class Jiang extends AbstractPiece {


    Jiang(Point p, int s) {
        this.pos = p;
        this.side =s;
    }
    @Override
    public String getName() {
        return "将";
    }




}
