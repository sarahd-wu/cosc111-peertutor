public class Hand {
    Card[] arr;
    int index = 1; //position in array to store the next Card

    public Hand(int n) {

        // Initializes the size of array
        arr = new Card[n+1];

    }

    int capacity(){
        return arr.length;
    }

    int size(){
        return index;
    }

    public String toString(){
        String string = "";
        arr[0] = null;
        for (int i = 1; i < index; i++) {
            string = string + arr[i] + " ";
        }
        return "" + string;
    }

    void addCard(Card c) {

        if (arr.length > index) {
            arr[index] = c;
            index++;
        }
        else {
            System.out.println(this);
            System.out.println("ERROR! Hand is filled!");
        }

    }

    Card getCard(int i) {
        if (i <= index) {
            return arr[i+1];
        } else {
            System.out.println("Error! Not enough cards");
            return null;
        }
    }
}
