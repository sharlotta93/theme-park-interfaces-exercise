package Attractions;
import Visitor.*;

public class Dodgem extends Attraction{

    public Dodgem(String name, double rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 5.5;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ( visitor.getAge() > 8);
    }
}
