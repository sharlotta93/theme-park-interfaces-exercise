package Stalls;

import Attractions.IRating;

public abstract class Stall implements IRating {

    private String name;
    private String ownerName;
    private double rating;

    public Stall(String name, String ownerName, double rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public String getOwnerName() {
        return ownerName;
    }

}
