package strategy;

public class Cannon implements IStrategy {
    @Override
    public void fighting() {
        System.out.println("Fire");
    }
}
