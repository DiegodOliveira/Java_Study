package AceofSpades;

public class DeckofCardstest {
    public static void main(String[] args) {
        DeckofCards myDeckofCards = new DeckofCards();
        myDeckofCards.shuffle();
        // Imprime todas as 52 cartas na ordem em que elas são distribuídas
        for (int i = 1; i <= 52; i++){
            // Distribui e exibe uma Card
            System.out.printf("%-19s", myDeckofCards.dealCard());

            if(i % 4 == 0) // Gera uma nova linha após cada quarta carta
                System.out.println();
        }
    }
}
