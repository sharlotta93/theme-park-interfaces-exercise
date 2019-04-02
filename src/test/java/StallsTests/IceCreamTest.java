package StallsTests;

import Attractions.Dodgem;
import Stalls.IceCream;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {


       IceCream iceCream;

        @Before
        public void before() {
            iceCream = new IceCream("Swirls", "Janet Brown", 3.9);
        }

        @Test
        public void hasName() {
            assertEquals("Swirls", iceCream.getName());
        }

        @Test
        public void hasOwnerName() {
            assertEquals("Janet Brown", iceCream.getOwnerName());
        }

        @Test
        public void hasRating() {
            assertEquals(3.9, iceCream.getRating(), 1);
        }
    
}
