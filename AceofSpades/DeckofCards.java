package AceofSpades;
import java.security.SecureRandom;

public class DeckofCards {
    private Card[] deck; // Array de objetos card
    private int currentCard; // Índice da próxima carta a ser distribuída (0-51)
    private final int NUMBER_OF_CARDS = 52; // Número distribuído de cartas
    private static final SecureRandom  randomNumbers = new SecureRandom(); // Gerador de números aleatórios
    // Construtor que preenche baralho de cartas
    public DeckofCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // Cria array de objetos card
        currentCard = 0; // A primeira carta a ser distribuída será o deck[0]
        // Preenche baralho com objetos Card
        for (int count = 0; count < deck.length; count++)
            deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }
    // Embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){
        currentCard = 0; // A próxima chamada para o método dealCard deve começar no deck[0] novamente
        // Para cada Card, seleciona outra Card aleatória (0-51) e as compara
        for (int first = 0; first < deck.length; first++){
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);// Seleciona número aleatório entre 0 e 51
            // Compara Card atual com Card aleatoriamente selecionada
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard(){ // Distribui uma Card
        if (currentCard < deck.length) // Determina se ainda há Cards a serem distribuídas
            return deck[currentCard++]; // Return carta atual o array
        else return null; // retorna nulo para indicar que todos as Cards foram distribuídas
    }

}
