package state;

public class Room {
    protected State s;

    public String getState() {
        return s.getState();
    }

    public void setState(State s) {
        this.s = s;
    }

    public void book() {
        s.book();
        s = new BookState();
    }

    public void checkin() {
        s.checkin();
        s = new CheckinState();
    }

    public void unBook() {
        s.unBook();
        s = new FreeState();
    }

    public void checkout() {
        s.checkout();
        s = new FreeState();
    }
}
