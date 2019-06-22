package decorator;

public class A1Car extends Car {
    public A1Car() {
        this.cost = 10000;
        this.description = "Audi A1 Car";
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
