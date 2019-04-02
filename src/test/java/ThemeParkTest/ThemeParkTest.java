package ThemeParkTest;

import Attractions.IRating;
import Attractions.Rollercoaster;
import Stalls.IceCream;
import ThemePark.ThemePark;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark park;
    IRating rollercoaster;
    IRating stall;

    @Before
    public void before() {
     park = new ThemePark();
     stall = new IceCream("ChocoLoco", "Bob Davis", 2.4);
     rollercoaster = new Rollercoaster("BungeeRush", 5.0);
    }

    @Test
    public void hasAnArrayOfReviewedParts() {
        park.addRatedPart(rollercoaster);
        park.addRatedPart(stall);
        assertEquals(2, park.getAllReviewed().size());
    }
}
