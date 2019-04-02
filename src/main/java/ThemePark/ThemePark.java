package ThemePark;
import Attractions.*;
import Visitor.Visitor;

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

    public void visit(Attraction attraction, Visitor visitor) {
        if (visitor.totalCash() > attraction.defaultPrice() && attraction.isAllowedTo(visitor)) {
            visitor.pay(attraction.defaultPrice());
        }
    }
}



