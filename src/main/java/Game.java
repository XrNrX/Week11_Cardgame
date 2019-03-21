import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(){
        this.players = new ArrayList<Player>();
        this.deck = this.makeDeck();
    }

    public void addPlayers(Player player1, Player player2) {
        players.add(player1);
        players.add(player2);

    }

    public int countPlayers() {
        return this.players.size();
    }

    public Deck makeDeck() {
        Deck deck = new Deck();
        deck.populate();
        deck.shuffleDeck();
        return deck;
    }

    public Deck getDeck() {
        return deck;
    }

    public Player play() {
        this.dealToPlayers();
        int v = 0;
        int i = 0;
        for (Player player : players){
            if (v < player.getCards().get(i).getValue()){
                v = player.getCards().get(i).getValue();
            } else {
                this.dealToPlayers();
                i++;
                continue;
            }
        }
        int j;
        for (j = 0; j < players.size(); j++){
            if (v == players.get(0).getCards().get(0).getValue()){
                break;
            }
        }
        if (j == 0){
            return players.get(j);
        } else {
            return players.get(j - 1);
        }
    }

    public void dealToPlayers() {
        for(Player player : players){
            this.deck.deal(player);
        }
    }
}
