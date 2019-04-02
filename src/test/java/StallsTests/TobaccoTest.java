package StallsTests;

import Stalls.Tobacco;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoTest {

    Tobacco tobacco;
    Visitor teenager;
    Visitor adult;

    @Before
    public void before() {
        tobacco = new Tobacco("Smokey", "Bad Billy", 1.0);
        teenager = new Visitor(16, 125.00, 5.50);
        adult = new Visitor(20, 169.0, 50.0);
    }

    @Test
    public void hasName() {
        assertEquals("Smokey", tobacco.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Bad Billy", tobacco.getOwnerName());
    }

    @Test
    public void hasRating() {
        assertEquals(1.0, tobacco.getRating(), 1);
    }

    @Test
    public void isAllowedToBuyTobacco() {
        assertEquals(true, tobacco.isAllowedTo(adult));
    }

    @Test
    public void isNotAllowedToBuyTocacco() {
        assertEquals(false, tobacco.isAllowedTo(teenager));
    }


}
