package model;

import java.awt.*;

public class Bing extends AbstractPiece{

    Bing(Point p, int s) {
        this.pos = p;
        this.side =s;
    }


    @Override
    public String getName() {
        return "兵";
    }


}
