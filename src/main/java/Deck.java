import java.util.*;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<Card>();
    }

    public int countCards() {
        return cards.size();
    }


    public void populate() {
        for(int i = 0; i < SuitType.values().length; i++){
            for(int j = 0; j < RankType.values().length; j++){
//                System.out.println("Suit: " + SuitType.values()[i] + " Value: " + RankType.values()[j]);
                cards.add(new Card(SuitType.values()[i], RankType.values()[j]));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(cards);
//        for(Card card : cards){
//            System.out.println("Suit: " + card.getSuit() + " Value " + card.getRank() );
//        }
    }

    public void deal(Player player) {
        player.getCards().add(cards.remove(0));
    }
}
