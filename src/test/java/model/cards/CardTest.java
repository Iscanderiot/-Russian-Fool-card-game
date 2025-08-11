package model.cards;

import org.junit.jupiter.api.Test;

import model.cards.Card;
import model.cards.Game;
import model.cards.Board;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Random;

public class CardTest{
    Card card1 = new Card(Suit.CLUBS, Rank.SIX);
    Card card2 = new Card(Suit.CLUBS, Rank.JACK);
    Card card3 = new Card(Suit.HEARTS, Rank.KING);
    Card card4 = new Card(Suit.SPADES, Rank.SEVEN);

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
    public void testSameSuit1(){
        assertTrue(card1.sameSuit(card2));
    }

    @Test
    public void testSameSuit2(){
        assertFalse(card2.sameSuit(card3));
    }

    @Test
    public void testSameSuit3(){
        assertFalse(card1.sameSuit(card3));
    }

    @Test
    public void testSameRank1(){
        assertFalse(card1.sameRank(card2));
    }

    @Test
    public void testSameRank2(){
        assertFalse(card2.sameRank(card3));
    }

    @Test
    public void testSameRank3(){
        assertFalse(card1.sameRank(card3));
    }
    
    @Test
    public void testSameSuit4(){
        assertTrue(card1.sameSuit(Suit.CLUBS));
    }

    @Test
    public void testTrumpCard1(){
        assertTrue(card1.isTrumpCard(Suit.CLUBS));
    }

    @Test
    public void testTrumpCard2(){
        assertFalse(card1.isTrumpCard(Suit.HEARTS));
    }

    @Test
    public void testCanBeBeaten(){
        Suit TrumpSuit = Suit.HEARTS;
        assertTrue(card1.canBeBeaten(card3, TrumpSuit));
        assertTrue(card1.canBeBeaten(card2, TrumpSuit));
        assertFalse(card2.canBeBeaten(card1, TrumpSuit));
        assertFalse(card1.canBeBeaten(card4, TrumpSuit));
    }
}
