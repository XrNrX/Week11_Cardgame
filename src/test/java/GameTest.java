import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Player player1, player2;
    Deck deck;

    @Before
    public void setup(){
        game = new Game();
        player1 = new Player();
        player2 = new Player();
//        deck = new Deck();
//        deck.populate();
//        deck.shuffleDeck();
    }

    @Test
    public void gameHasPlayers() {
        game.addPlayers(player1, player2);
        assertEquals(2, game.countPlayers());
    }

    @Test
    public void gameHasADeck() {
        Deck deck = game.getDeck();
        assert(deck instanceof Deck);
    }

    @Test
    public void gameHasAWinner() {
        game.addPlayers(player1, player2);
        game.getDeck();
        assert(game.play() instanceof Player);
    }
}
