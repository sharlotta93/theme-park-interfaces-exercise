package Visitor;

public class Visitor {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double totalCash() {
        return money;
    }

    public double pay(double price) {
        return money -= price;
    }

}
