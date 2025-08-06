package model.cards;

import org.junit.jupiter.api.Test;

import model.cards.Card;

import static org.junit.jupiter.api.Assertions.*;

public class CardTest{

    Card card1 = new Card(Suit.CLUBS, Rank.SIX);
    Card card2 = new Card(Suit.CLUBS, Rank.JACK);
    Card card3 = new Card(Suit.HEARTS, Rank.KING);

    @Test
    public void testGetRank1(){
        assertEquals(card1.getRank(), Rank.SIX); 
    }

    @Test
    public void testGetRank2(){
        assertEquals(card2.getRank(), Rank.JACK); 
    }

    @Test
    public void testGetRank3(){
        assertEquals(card3.getRank(), Rank.KING); 
    }

    @Test
    public void testGetSuit1(){
        assertEquals(card1.getSuit(), Suit.CLUBS);
    }

    @Test
    public void testGetSuit2(){
        assertEquals(card2.getSuit(), Suit.CLUBS);
    }

    @Test
    public void testGetSuit3(){
        assertEquals(card3.getSuit(), Suit.HEARTS);
    }

    @Test
    public void testToString1(){
        assertEquals(card1.toString(), "clubs Six");
    }

    @Test
    public void testToString2(){
        assertEquals(card2.toString(), "clubs Jack");
    }

    @Test
    public void testsameSuit1(){
        assertTrue(card1.sameSuit(card2));
    }

    @Test
    public void testsameSuit2(){
        assertFalse(card2.sameSuit(card3));
    }

    @Test
    public void testsameSuit3(){
        assertFalse(card1.sameSuit(card3));
    }

    
}