/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
    public static void main(String[] args) {
        String [] rank = {"Ace", "Queen", "King"};
        String [] suit = {"Hearts", "Clubs"};
        int [] value = {1, 10, 10, 8};
        Deck a = new Deck(rank, suit, value);

        System.out.println(a);
    }
}