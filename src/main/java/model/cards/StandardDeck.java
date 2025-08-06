package model.cards;
import java.util.Collections;
import java.util.Stack;

public class StandardDeck {
    Stack<Card> cards = new Stack<>();

    public StandardDeck(){
        for (Suit suit : Suit.values()){
            for (Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public Stack<Card> getCards(){
        return this.cards;
    }

    public Card pickTopCard(){
        return cards.pop();
    }

    public Card lookAtTopCard(){
        return cards.peek();
    }

    public void putCard(Card card){
        cards.push(card);
    }
    
    public void shuffleDeck(){
        Collections.shuffle(cards);
    }

    @Override
    public String toString(){
        return this.cards.toString();
    }

    public static void main(String[] args) {
        StandardDeck deck1 = new StandardDeck();
        System.out.println(deck1.getCards());
        System.out.println(deck1.lookAtTopCard());
        deck1.shuffleDeck();
        System.out.println();
        System.out.println(deck1.getCards());
    }
}
