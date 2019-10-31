package decorator;

public class A6Car extends Car {
    public A6Car() {
        this.cost = 16000;
        this.description = "Audi A6 Car";
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
