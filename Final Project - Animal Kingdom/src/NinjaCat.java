import java.awt.*;

import static java.awt.SystemColor.info;

public class NinjaCat extends Critter{
    Color myColor=Color.lightGray ;
    String myString="Meow";

    public NinjaCat() {
    }

    public Action getMove(CritterInfo info) {
            return (info.frontThreat() || info.backThreat() || info.leftThreat() || info.rightThreat())?
                    Action.INFECT:(info.getFront() != Neighbor.WALL)?Action.HOP:
                    (info.getRight() != Neighbor.WALL)?Action.RIGHT:Action.LEFT;
    }

    public Color getColor() {
        return myColor;
    }

    public String toString() {
        return myString;
    }
}
