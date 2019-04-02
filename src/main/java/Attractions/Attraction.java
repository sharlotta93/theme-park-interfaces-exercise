package Attractions;

import Visitor.Visitor;


public abstract class Attraction implements ITicketed, ISecurity, IRating{

    private String name;
    private double rating;

    public Attraction(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public abstract double defaultPrice();

    public abstract double priceFor(Visitor visitor);

    public abstract boolean isAllowedTo(Visitor visitor);

}
