package iterator;

public class Client {
    public static void main(String[] args) {
        ITelevision tv = new HaierTV();
        Iterator it = tv.createIterator();
        System.out.println(it.first().getName());
        while (!it.isDone()) {
            System.out.println(it.next().getName());
        }
    }
}
