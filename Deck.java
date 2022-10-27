import java.util.Random;

public class Deck {
    Card[] deck;
    int index;

    public Deck() {
        int num = 0;
        deck = new Card[52];
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 14; j++) { // starting from 1
                Card card = new Card(i, j);
                deck[num] = card;
                num++;
            }
        }
    }

    public String toString() {
        String string = "";
        for (int i = index; i < this.size(); i++) {
            string = string + deck[i] + " ";
        }
        return string;
    }

    int size() {
        return deck.length-index;
    }

    void shuffle() {
        Random r = new Random();

        // Start from back to front (i)
        for (int i = this.size()-1; i >= index; i-- ) {

            // j is less than i
            int j = r.nextInt(i+1);
            // swap the card at j w/ i
            Card temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    Hand getHand(int n) {
        // if size of deck is larger than size of hand
        if (this.size() >= n) {
            Hand newHand = new Hand(n);
            int newIndex = index + 5;

            // filling up the hand
            for (int i = index; i < newIndex; i++) {
                newHand.addCard(deck[i]);
            }

            // update index
            index = newIndex;
            return newHand;

        } else {
            System.out.println("ERROR! Not enough cards in deck!");
            return null;
        }
    }
}
