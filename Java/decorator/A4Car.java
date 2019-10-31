package decorator;

public class A4Car extends Car {
    public A4Car() {
        this.cost = 12000;
        this.description = "Audi A4 Car";
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}