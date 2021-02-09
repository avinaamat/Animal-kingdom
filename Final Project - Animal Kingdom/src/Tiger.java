import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private String myString="TGR";
    private PossibleColors current;
    private enum PossibleColors {
        RED, GREEN, BLUE
    }
    private int move_count=0;

    public Tiger() {
    }

    public Action getMove(CritterInfo info) {
        move_count++;
        return info.frontThreat()?Action.INFECT:(info.getFront()== Neighbor.WALL || info.getRight() == Neighbor.WALL)?
                                                    Action.LEFT:info.getFront()== Neighbor.SAME?Action.RIGHT:Action.HOP;
    }
    public Color getColor() {
        if(move_count%3==0){
            PossibleColors[] allColors = PossibleColors.values(); //get the array of colors
            int randomNum = new Random().nextInt(allColors.length); //generate a random number in [0; allColors.length-1]
            PossibleColors randomColor = allColors[randomNum];
            current=randomColor;
        }
        return current==PossibleColors.RED?Color.RED:current==PossibleColors.GREEN?Color.GREEN:Color.BLUE;
    }

    public String toString() {
        return myString;
    }
}