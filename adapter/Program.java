package adapter;

public class Program {
    public static void main(String[] args) {

        ITarget flyDeer1 = new ClassAdapter();
        flyDeer1.fly();
        flyDeer1.run();

        ITarget flyDeer2 = new ObjectAdapter(new Deer());
        flyDeer2.fly();
        flyDeer2.run();
    }
}
