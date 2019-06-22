package decorator;

public class Decorator extends Car {

    protected Car c;
    protected int decoratorCost;
    protected String decoratorDescription;

    public void setC(Car c) {
        this.c = c;
    }

    @Override
    public int getCost() {
        return decoratorCost + c.getCost();
    }

    @Override
    public String getDescription() {
        return c.getDescription() + decoratorDescription;
    }
}
