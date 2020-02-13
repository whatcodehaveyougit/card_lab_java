import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before() {
        deck = new Deck();
        card = new Card(Suit.HEARTS, Rank.TWO);
    }

    @Test
    public void test_deck_starts_empty() {
        assertEquals(0, deck.getDeckSize());
    }

    @Test
    public void test_can_populate_deck() {
        deck.createDeck();
        assertEquals(52, deck.getDeckSize());
    }

    @Test
    public void returns_52_cards() {
        deck.createDeck();
        deck.shuffleDeck();
    }

//    @Test
//    public void return_rand_card() {
//        deck.createDeck();
//        deck.shuffleDeck();
//        deck.getRandomCard();
//        assertEquals(card, deck.getRandomCard());
//    }


}
