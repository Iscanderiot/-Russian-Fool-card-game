package model.cards;

import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Card implements Comparable<Card>{
    Rank rank;
    Suit suit;

    public Card(Suit suit, Rank rank){
        this.rank = rank;
        this.suit = suit;
    }

    public Card GenerateRandomCard(){
        Random rand = new Random();
        return null;
    }

    public Rank getRank(){
        return this.rank;
    }

    public Suit getSuit(){
        return this.suit;
    }

    @Override
    public String toString(){
        return this.suit.toString() +" "+ this.rank.toString();
    }

    public boolean sameRank(Card other){
        return this.getRank() == other.getRank();
    }

    public boolean sameSuit(Suit suit){
        return this.getSuit() == suit;
    }

    public boolean sameSuit(Card other){
        return this.getSuit() == other.getSuit();
    }

    public boolean isTrumpCard(Suit TrumpCard){
        return this.getSuit() == TrumpCard;
    }

    public boolean canBeBeaten(Card otherCard, Suit TrumpCard){
        if (this.isTrumpCard(TrumpCard)){
            if (otherCard.isTrumpCard(TrumpCard)){
                return (otherCard.getRank().getValue() > this.getRank().getValue());
            }
            else{
                 return false;
                 }
            }

        else{
            if (otherCard.isTrumpCard(TrumpCard)){
                return true;
            }
            else{
                if (this.sameSuit(otherCard)){
                    return (otherCard.getRank().getValue() > this.getRank().getValue());
                }
                else{
                    return false;
                }
            }
        }
        }

    //1 if greater
    //-1 if lesser
    //0 if equal, which is should not be the case
    @Override
    public int compareTo(Card other) {
        if (this.getSuit() == other.getSuit()) {
        return Integer.compare(this.rank.getValue(), other.rank.getValue());
    } else {
        throw new IllegalArgumentException("Cannot compare cards of different suits.");
    }
    }

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.ACE);
        Card card2 = new Card(Suit.DIAMONDS, Rank.EIGHT);
        Card card3 = new Card(Suit.CLUBS, Rank.KING);
        //System.out.println(card1.compareTo(card2));  Should cause an exception
        System.out.println(card1.sameRank(card3));
        System.out.println(card1.sameSuit(card3));
        Suit Trump = Suit.CLUBS;
        System.out.println(card1.canBeBeaten(card2, Trump));
        System.out.println(card3.compareTo(card1));
        System.out.println(card1.getRank());
    }

}
