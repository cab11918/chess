package model;

import java.awt.*;

public class Ma extends AbstractPiece {
    Ma(Point p, int s) {
        this.pos = p;
        this.side =s;
    }

    @Override
    public String getName() {
        return "马";
    }




}
