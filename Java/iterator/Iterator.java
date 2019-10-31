package iterator;

public interface Iterator {
    Item first();
    Item next();
    boolean isDone();
    Item currentItem();
}
