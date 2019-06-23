package state;

abstract public class State {
    public abstract String getState();
    public abstract void book();
    public abstract void checkin();
    public abstract void unBook();
    public abstract void checkout();
}
