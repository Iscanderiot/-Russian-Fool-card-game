package model.cards;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class FightTest {
    ArrayList<Card> attackerCards = new ArrayList<>();
    ArrayList<Card> defenderCards = new ArrayList<>();
    Player attacker = new Player("Josh");
    Player defender = new Player("Barret");
    Board board = new Board();
    Game game1 = new Game(board);
    {
    game1.addPlayer(attacker);
    game1.addPlayer(defender);
    }
    


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
        {game1.getPlayer(0).takeCard(card1);
        game1.getPlayer(0).takeCard(card2);
        game1.getPlayer(0).takeCard(card3);
        game1.getPlayer(0).takeCard(card4);
        game1.getPlayer(0).takeCard(card5);
        game1.getPlayer(0).takeCard(card6);

        game1.getPlayer(1).takeCard(card7);
        game1.getPlayer(1).takeCard(card8);
        game1.getPlayer(1).takeCard(card9);
        game1.getPlayer(1).takeCard(card10);
        game1.getPlayer(1).takeCard(card11);
        game1.getPlayer(1).takeCard(card12);}
        
        @Test

        Fight fight = new Fight(game1, game1.getPlayer(0), game1.getPlayer(1), Suit.HEARTS);
        fight.
}
