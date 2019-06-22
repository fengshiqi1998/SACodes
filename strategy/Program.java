package strategy;

public class Program {
    public static void main(String[] args) {
        Context context;

        context = new Context(new Knife());
        context.fighting();

        context = new Context(new Bow());
        context.fighting();

        context = new Context(new Cannon());
        context.fighting();
    }
}
