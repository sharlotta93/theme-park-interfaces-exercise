package Attractions;
import Visitor.*;

public interface ITicketed {

    double defaultPrice();

    double priceFor(Visitor visitor);
}
