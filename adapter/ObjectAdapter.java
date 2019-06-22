package adapter;

public class ObjectAdapter implements ITarget {
    private Deer deer;
    public ObjectAdapter(Deer deer) {
        this.deer = deer;
    }
    public void run() {
        this.deer.run();
    }
    public void fly() {
        System.out.println("I can fly");
    }
}
