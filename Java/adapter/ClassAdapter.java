package adapter;

public class ClassAdapter  extends Deer  implements ITarget{

    public void fly() {
        System.out.println("I can fly");
    }
}
