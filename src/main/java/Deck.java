import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();

    }


    public int getDeckSize() {
        return this.cards.size();
    }



    public void createDeck() {
        for(Suit suit : Suit.values()){
            for(Rank rank : Rank.values()){
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

//    public int getRandomNumber() {
//         Obtain a number between [0 - 49].
//       int n = rand.nextInt(50);
//        return 32;

//    }

    public Card getRandomCard() {
        Card theCard = cards.get(0);
        return theCard;
    }
}
