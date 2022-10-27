public class Game {
    static Deck deckOne = new Deck();

    public static void main(String[] args) {
        System.out.println("Deck One: "+ deckOne);


        // shuffle
        deckOne.shuffle();
        System.out.println("Deck One: " + deckOne);

        // hand
        Hand playerOne = deckOne.getHand(5);
        System.out.println("Hand One: " + playerOne);
        System.out.println("Deck One: " + deckOne);
    }
}
