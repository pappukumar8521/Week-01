import java.util.Random;
import java.util.Scanner;

public class CardDeck {

    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numOfPlayers, int numOfCards) {
        if (numOfCards * numOfPlayers > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return new String[0][0];
        }

        String[][] players = new String[numOfPlayers][numOfCards];
        int cardIndex = 0;
        
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        
        return players;
    }

    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (String card : players[i]) {
                System.out.print(card + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards per player: ");
        int numOfCards = scanner.nextInt();

        String[][] players = distributeCards(deck, numOfPlayers, numOfCards);
        printPlayersCards(players);

        scanner.close();
    }
}
