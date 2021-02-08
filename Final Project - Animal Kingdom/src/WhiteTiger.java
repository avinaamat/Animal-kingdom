import java.awt.*;

public class WhiteTiger extends Critter {

    private boolean infected=false;
    Color myColor=Color.WHITE ;
    public WhiteTiger() {
    }
    public Action getMove(CritterInfo info) {
        if(info.frontThreat()){
            infected=true;
            return Action.INFECT;
        }
        else if(info.getFront()== Neighbor.WALL || info.getRight() == Neighbor.WALL) return Action.LEFT;
        else if(info.getFront()== Neighbor.SAME) 				 return Action.RIGHT;
        else 										 return Action.HOP;
    }

    public Color getColor() {
        return myColor ;
    }

    public String toString() {
        if(!infected)       return "tgr";
        else                return "TGR";
    }
}
