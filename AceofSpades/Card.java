package AceofSpades;
// Class Card representa uma carta do baralho
public class Card {
    private final String face; // Face da carta("Ace", "Deuce"...)
    private final String suit; // Naipe da carta("Hearts", "Diamonds"...)
    // Construtor de dois elementos, a "face" e o naipe da carta
    public Card(String cardface, String cardsuit){
        this.face = cardface;
        this.suit = cardsuit;
    }
    // Retorna representação string de card
    public String toString(){
        return face + " of " + suit;
    }
}
