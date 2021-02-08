import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    public Tiger() {
    }

    String myString="TGR";
    PossibleColors current;
    private enum PossibleColors {
        RED, GREEN, BLUE
    }
    private int move_count=0;

    public Action getMove(CritterInfo info) {
        move_count++;
        if(info.frontThreat())			 			 return Action.INFECT;
        else if(info.getFront()== Neighbor.WALL || info.getRight() == Neighbor.WALL) return Action.LEFT;
        else if(info.getFront()== Neighbor.SAME) 				 return Action.RIGHT;
        else 										 return Action.HOP;
    }

    public Color getColor() {
        if(move_count%3==0){
            PossibleColors[] allColors = PossibleColors.values(); //get the array of colors
            int randomNum = new Random().nextInt(allColors.length); //generate a random number in [0; allColors.length-1]
            PossibleColors randomColor = allColors[randomNum];
            current=randomColor;
        }
        if(current==PossibleColors.RED)            return Color.RED;
        else if(current==PossibleColors.GREEN)     return Color.GREEN;
        else                        return Color.BLUE;

    }

    public String toString() {
        return myString;
    }
}