package AttractionsTests;

import Attractions.Rollercoaster;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

     Rollercoaster rollercoaster;
     Visitor child;
     Visitor adult;

    @Before
    public void before() {
        rollercoaster = new Rollercoaster("4 flags", 4.9);
        child = new Visitor(9, 125.00, 5.50);
        adult = new Visitor(20, 169.0, 50.0);
    }

    @Test
    public void hasName() {
        assertEquals("4 flags", rollercoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(4.9, rollercoaster.getRating(), 1);
    }

    @Test
    public void hasPrice() {
        assertEquals(8.5, rollercoaster.defaultPrice(), 1);
    }

    @Test
    public void isAllowedIn() {
        assertEquals(true, rollercoaster.isAllowedTo(adult));
    }

    @Test
    public void isNotAllowedIn() {
        assertEquals(false, rollercoaster.isAllowedTo(child));
    }

    @Test
    public void isNotAllowedInTooShort() {
        Visitor adult2 = new Visitor(21, 139.0, 50.0);
        assertEquals(false, rollercoaster.isAllowedTo(adult2));
    }

}
