package state;

abstract public class State {
    public abstract String getState();
    public abstract int book();
    public abstract int checkin();
    public abstract int unBook();
    public abstract int checkout();
}
