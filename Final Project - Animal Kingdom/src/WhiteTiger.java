import java.awt.*;

public class WhiteTiger extends Critter {

    private boolean infected;
    private Color myColor=Color.WHITE ;

    public WhiteTiger() {
    }

    public Action getMove(CritterInfo info) {
        if(info.frontThreat()){
            infected=true;
            return Action.INFECT;
        }
        return (info.getFront()== Neighbor.WALL || info.getRight() == Neighbor.WALL)?Action.LEFT:
                (info.getFront()== Neighbor.SAME)?Action.RIGHT:Action.HOP;
    }

    public Color getColor() {
        return myColor ;
    }

    public String toString() {
        return infected?"TGR":"tgr";
    }
}
