import java.util.ArrayList;
public class Cards {
    private static int numOffset = 0;
    public static ArrayList<Card> deckList = new ArrayList<>();
    public static void loadDeck() {
        int currNum;
        Card currCard;
        for (int i = 0; i < 52; i++) {
            currCard = new Card();
            currCard.setNum(i % 13);
            currCard.setSuitAndColor(i);
            deckList.add(currCard);
        }
    }
    public static void displayDeck() {
        for (int i = 0; i < 52; i++) {
            Card currCard;
            currCard = deckList.get(i);
            System.out.println(currCard.getFullCard());
        }
    }
    public static Card dealCard() {
        int rand = (int)(Math.random() * (52 - numOffset) );
        Card currCard = deckList.get(rand);
        removeCard(rand);
        return currCard;

    }
    public static void removeCard(int num) {
        deckList.remove(num);
        numOffset++;
    }
}
