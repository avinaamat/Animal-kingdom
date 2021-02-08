import java.awt.*;

import static java.awt.SystemColor.info;

public class NinjaCat extends Critter{
    Color myColor=Color.lightGray ;
    String myString="Meow";
    public NinjaCat() {
    }
    public Action getMove(CritterInfo info) {
        if(info.frontThreat() || info.backThreat() || info.leftThreat() || info.rightThreat()){
            return Action.INFECT;
        }else   if(info.getFront() != Neighbor.WALL)    return Action.HOP;
        else    if(info.getRight() != Neighbor.WALL)    return Action.RIGHT;
        else /*if(info.getLeft() != Neighbor.WALL) */   return Action.LEFT;
    }

    public Color getColor() {
        return myColor;
    }

    public String toString() {
        return myString;
    }
}
