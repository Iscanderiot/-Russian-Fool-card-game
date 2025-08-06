package model.cards;
import java.util.ArrayList;
import java.util.Random;

public class Player {
    private String name;
    private int ID;
    private ArrayList<Card> cards = new ArrayList();

    public Player(String name){
        this.name = name;
    }

    public ArrayList<Card> getCards(){
        return this.cards;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.ID;
    }

    public int getNumberOfCards(){
        return this.cards.size();
    }

    public void takeCard(Card card){
        this.cards.add(card);
    }


    public Card putRandomCard(){
        Random rand = new Random();
        int randomNumber = rand.nextInt(this.getNumberOfCards());
        Card card = this.cards.remove(randomNumber);
        return card;
    }

    //probably here's going to be implemented any strategy but for now, they are going to throw random cards at each other
    public Card throwCard(){
        return this.putRandomCard();
    }

    @Override
    public String toString(){
        return this.getName();
    }

    public static void main(String[] args) {
        
    }
}
