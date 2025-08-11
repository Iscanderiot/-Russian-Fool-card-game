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
    Board board = new Board();
    ArrayList<Card> attackerCards = new ArrayList<>();
    ArrayList<Card> defenderCards = new ArrayList<>();
    Player attacker = new Player("Josh");
    Player defender = new Player("Barret");
    Game game1 = new Game(board);
    {
    game1.addPlayer(attacker);
    game1.addPlayer(defender);
    }
    Random random = new Random(1);

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
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        Card card2 = new Card(Suit.DIAMONDS, Rank.THREE);
        Card card3 = new Card(Suit.DIAMONDS, Rank.SIX); //attacking card
        Card card4 = new Card(Suit.SPADES, Rank.TWO);
        Card card5 = new Card(Suit.HEARTS, Rank.JACK);
        Card card6 = new Card(Suit.CLUBS, Rank.QUEEN);

        Card card7 = new Card(Suit.HEARTS, Rank.TWO);
        Card card8 = new Card(Suit.HEARTS, Rank.SEVEN);
        Card card9 = new Card(Suit.HEARTS, Rank.ACE);
        Card card10 = new Card(Suit.DIAMONDS, Rank.FIVE);
        Card card11 = new Card(Suit.DIAMONDS, Rank.TEN);
        Card card12 = new Card(Suit.DIAMONDS, Rank.ACE);
        game1.getPlayer(0).takeCard(card1);
        
        Fight fight = new Fight(game1, game1.getPlayer(0), game1.getPlayer(1), Suit.HEARTS);
        
    }
}
