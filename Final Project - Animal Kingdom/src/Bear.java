import java.awt.*;

public class Bear extends Critter {
    private boolean polar =false;
    private boolean slash=false;
    private int move_count=0;

    public Bear(boolean polar) {
        this.polar = polar;
    }

    public Action getMove(CritterInfo info) {
        move_count++;
        return info.frontThreat()? Action.INFECT:(info.getFront() != Critter.Neighbor.WALL)?Action.HOP:Action.LEFT;
    }
    public Color getColor() {
        return polar?Color.WHITE:Color.BLACK;
    }

    public String toString() {
        slash=!slash;
        return slash?"/":"\\";
    }
}