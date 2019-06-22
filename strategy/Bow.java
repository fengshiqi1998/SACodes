package strategy;

public class Bow implements  IStrategy {
    @Override
    public void fighting() {
        System.out.println("Shoot");
    }
}
