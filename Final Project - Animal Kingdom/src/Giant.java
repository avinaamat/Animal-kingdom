import java.awt.*;

public class Giant extends Critter{
    private int move_count=0;
    private Color myColor=Color.GRAY ;

    public Giant() {
    }

    public Critter.Action getMove(CritterInfo info) {
        move_count++;
        return info.frontThreat()?Action.INFECT:info.getFront() != Critter.Neighbor.WALL?Action.HOP:Action.RIGHT;
    }

    public Color getColor() {
        return myColor ;
    }

    public String toString() {
        return (0<=move_count%24 && 6>move_count%24)?"fee":(6<=move_count%24 && 12>move_count%24)?"fie":
                                                    (12<=move_count%24 && 18>move_count%24)?"foe":"fum";
    }
}
