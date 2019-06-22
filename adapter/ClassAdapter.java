package adapter;

public class ClassAdapter implements ITarget{
    private Deer deer = new Deer();

    public void run() {
        this.deer.run();
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
