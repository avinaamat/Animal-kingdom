import java.awt.*;

public class Giant extends Critter{
    private int move_count=0;
    Color myColor=Color.GRAY ;
    public Giant() {
    }
    public Critter.Action getMove(CritterInfo info) {
        move_count++;
        if(info.frontThreat())
            return Critter.Action.INFECT;
        else if(info.getFront() != Critter.Neighbor.WALL){
            return Critter.Action.HOP;
        }else{
            return Critter.Action.RIGHT;
        }
    }

    public Color getColor() {
        return myColor ;
    }

    public String toString() {
        if(0<=move_count%24 && 6>move_count%24)         return "fee";
        else if(6<=move_count%24 && 12>move_count%24)   return "fie";
        else if(12<=move_count%24 && 18>move_count%24)  return "foe";
        else                                            return "fum";
    }
}
