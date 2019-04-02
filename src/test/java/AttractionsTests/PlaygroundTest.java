package AttractionsTests;

import Attractions.Playground;
import Visitor.Visitor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PlaygroundTest {

    Playground playground;
    Visitor child;
    Visitor adult;

    @Before
    public void before() {
        playground = new Playground("Happy Tree Friends", 1.9);
        child = new Visitor(9, 125.00, 5.50);
        adult = new Visitor(20, 169.0, 50.0);

    }

    @Test
    public void hasName() {
        assertEquals("Happy Tree Friends", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(1.9, playground.getRating(), 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(2.5, playground.defaultPrice(), 1);
    }

    @Test
    public void isAllowedIn() {
        assertEquals(true, playground.isAllowedTo(child));
    }

    @Test
    public void isNotAllowedIn() {
        assertEquals(false, playground.isAllowedTo(adult));
    }
}
