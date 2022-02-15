public class Card {
    //class variables
    private String suit;
    private String rank;
    private int pointValue;

    //default constructor
    public Card(String cardRank, String cardSuit, int cardPointValue) {
        this.rank = cardRank;
        this.suit = cardSuit;
        this.pointValue = cardPointValue;
    }

    //accessor methods
    public String suit() {
        return this.suit;
    }

    public String rank() {
        return this.rank;
    }

    public int pointValue() {
        return this.pointValue;
    }

    public boolean matches(Card otherCard) {
        return this.equals(otherCard);
    }

    @Override
    public String toString() {
        return this.rank + " of " + this.suit + "(point value = " + this.pointValue + ")";
    }
}