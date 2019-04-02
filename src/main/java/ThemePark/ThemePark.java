package ThemePark;
import Attractions.*;

import java.util.ArrayList;



public class ThemePark {

    private ArrayList ratedUnit;

    public ThemePark() {
        this.ratedUnit = new ArrayList<IRating>();
    }

    public void addRatedPart(IRating unit) {
        this.ratedUnit.add(unit);
    }

    public ArrayList getAllReviewed() {
        return ratedUnit;
    }
}



