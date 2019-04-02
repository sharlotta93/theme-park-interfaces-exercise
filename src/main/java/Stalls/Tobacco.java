package Stalls;

import Attractions.ISecurity;
import Visitor.Visitor;

public class Tobacco extends Stall implements ISecurity {

    public Tobacco(String name, String ownerName, double rating) {
        super(name, ownerName, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ( visitor.getAge() >= 18);
    }
}
