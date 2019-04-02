package Attractions;
import Visitor.*;


public class Rollercoaster extends Attraction{

    public Rollercoaster(String name, double rating) {
        super(name, rating);
    }

    public double defaultPrice() {
        return 8.5;
    }

    public double priceFor(Visitor visitor) {
        return defaultPrice();
    }

    public boolean isAllowedTo(Visitor visitor) {
        return ( visitor.getAge() > 12 && visitor.getHeight() > 145.00);
    }
}
