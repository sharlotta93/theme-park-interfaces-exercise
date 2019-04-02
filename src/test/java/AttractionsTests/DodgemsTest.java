package AttractionsTests;

import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgem dodgems;

    @Before
    public void before() {
        dodgems = new Dodgem("BumperCars", 3.9);
    }

    @Test
    public void hasName() {
        assertEquals("BumperCars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(3.9, dodgems.getRating(), 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(5.5, dodgems.defaultPrice(), 1);
    }
}
