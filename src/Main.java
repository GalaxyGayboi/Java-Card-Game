import java.util.*;
public class Main {

    public static void main(String[] args) {
        Cards deck = new Cards();
        ArrayList<Card> playerHand = new ArrayList<>();
        ArrayList<Card> cpuHand = new ArrayList<>();
        deck.loadDeck();
        for (int i = 0; i < 52; i++) {
            System.out.println(deck.dealCard().getFullCard());
        }
    }
}
