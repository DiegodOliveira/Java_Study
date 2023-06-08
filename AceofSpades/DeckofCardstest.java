package AceofSpades;

public class DeckofCardstest {
    public static void main(String[] args) {
        DeckofCards myDeckofCards = new DeckofCards();
        myDeckofCards.shuffle();

        for (int i = 1; i <= 52; i++){

            System.out.printf("%-19s", myDeckofCards.dealCard());

            if(i % 4 == 0)
                System.out.println();
        }
    }
}
