package model.cards;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RankTest {
    public Rank rank1 = Rank.FOUR;
    public Rank rank2 = Rank.JACK;
    public Rank rank3 = Rank.ACE;

    @Test
    public void testGetValue1(){
        assertEquals(4,rank1.getValue());
        assertEquals(11,rank2.getValue());
        assertEquals(14, rank3.getValue());
    }

    @Test
    public void testCompareByValue(){
        assertEquals(-1, rank2.compareByValue(rank3));
        assertEquals(1, rank3.compareByValue(rank2));
        assertEquals(-1, rank1.compareByValue(rank2));
    }

    @Test
    public void testToString(){
        assertEquals("Four",rank1.toString());
        assertEquals("Jack", rank2.toString());
        assertEquals("Ace", rank3.toString());
    }
}
