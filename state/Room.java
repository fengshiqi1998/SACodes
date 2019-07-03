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
        if(0 == s.book()) {
            s = new BookState();
        }
    }

    public void checkin() {
        if(0 == s.checkin()) {
            s = new CheckinState();
        }
    }

    public void unBook() {
        if(0 == s.unBook()) {
            s = new FreeState();
        }
    }

    public void checkout() {
        if(0 == s.checkout()) {
            s = new FreeState();
        }
    }
}
