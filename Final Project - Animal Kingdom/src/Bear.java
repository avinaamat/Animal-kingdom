import java.awt.*;

public class Bear extends Critter {
    public Bear(boolean polar) {
        this.polar = polar;
    }
    private boolean polar =false;
    private boolean slash=true;
    private int move_count=0;
    public Action getMove(CritterInfo info) {
        move_count++;
        if(info.frontThreat())
            return Action.INFECT;
        else if(info.getFront() != Critter.Neighbor.WALL){
            return Action.HOP;
        }else{
            return Action.LEFT;
        }
    }

    public Color getColor() {
        if(polar)	return Color.WHITE ;
        else		return Color.BLACK;
    }

    public String toString() {
        if(slash){
            slash=!slash;
            return "/";
        }else{
            slash=!slash;
            return "\\";
        }
    }
}