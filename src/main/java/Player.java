import java.util.ArrayList;

public class Player {

    private ArrayList<Card> cards;

    public Player(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return cards.size();
    }

    public ArrayList<Card> getCards() {
        return this.cards;
    }
}
