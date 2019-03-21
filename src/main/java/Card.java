public class Card {


    private SuitType suit;
    private RankType rank;

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit() {
        return this.suit;
    }


    public int getValue() {
        return this.rank.getValue();
    }

    public RankType getRank() {
        return this.rank;
    }
}
