package model.cards;
import java.util.ArrayList;
import java.util.Random;

public class Board {
    
    private int ID;
    
    public Board(){
        this.ID = new Random().nextInt(100);
    }

    public int getID(){
        return this.ID;
    }
    

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.getID());
    }
}
