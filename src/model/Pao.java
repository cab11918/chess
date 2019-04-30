package model;

import java.awt.*;

public class Pao extends AbstractPiece {
    Pao(Point p, int s) {
        this.pos = p;
        this.side =s;
    }

    @Override
    public String getName() {
        return "炮";
    }


}
