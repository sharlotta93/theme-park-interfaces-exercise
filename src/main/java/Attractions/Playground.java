package Attractions;
import Visitor.*;

public class Playground extends Attraction{

    public Playground(String name, double rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 2.5;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ( visitor.getAge() < 15);
    }
}
