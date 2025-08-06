package model.cards;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SuitTest {
    Suit suit1 = Suit.CLUBS;
    Suit suit2 = Suit.HEARTS;
    Suit suit3 = Suit.SPADES;
    Suit suit4 = Suit.DIAMONDS;

    @Test
    public void testToString1(){
        assertEquals(suit1.toString(), "clubs");
    }

    @Test
    public void testToString2(){
        assertEquals(suit2.toString(), "hearts");
    }

    @Test
    public void testToString3(){
        assertEquals(suit3.toString(), "spades");
    }

    @Test
    public void testToString4(){
        assertEquals(suit4.toString(), "diamonds");
    }


}
