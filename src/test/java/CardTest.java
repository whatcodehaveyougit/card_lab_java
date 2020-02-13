import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before() {
        card = new Card(Suit.HEARTS, Rank.TWO);
    }

    @Test
    public void can_get_suit() {
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void can_get_rank() {
        assertEquals(Rank.TWO, card.getRank());
    }

    @Test
    public void can_create_card() {
        assertEquals(Suit.HEARTS, card.getSuit());
        assertEquals(Rank.TWO, card.getRank());
    }
}
