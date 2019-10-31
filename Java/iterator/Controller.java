package iterator;

import java.util.Vector;

public class Controller implements Iterator {
    private int current = 0;
    Vector channel;
    public Controller(Vector v) {
        channel = v;
    }
    @Override
    public Item first() {
        current = 0;
        return (Item)channel.get(current);
    }

    @Override
    public Item next() {
        current++;
        return (Item)channel.get(current);
    }

    @Override
    public boolean isDone() {
        return current >= (channel.size() - 1);
    }

    @Override
    public Item currentItem() {
        return (Item)channel.get(current);
    }
}
