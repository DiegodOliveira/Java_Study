package AceofSpades;

public class Card {
    private final String face;
    private final String suit;

    public Card(String cardface, String cardsuit){
        this.face = cardface;
        this.suit = cardsuit;
    }

    public String toString(){
        return face + " of " + suit;
    }
}
