import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    public Deck deck;
    public Player player;

    @Before
    public void setup(){
        deck = new Deck();
        player = new Player();
    }

    @Test
    public void shouldStartEmpty() {
        assertEquals(0, deck.countCards());
    }

    @Test
    public void canPopulateDeck() {
        deck.populate();
        assertEquals(52, deck.countCards());
    }

    @Test
    public void canShuffleCards() {
        deck.populate();
        deck.shuffleDeck();
        assertEquals(52, deck.countCards());

    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.shuffleDeck();
        deck.deal(player);
        assertEquals(51, deck.countCards());
        assertEquals(1, player.countCards());
    }


}
