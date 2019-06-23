package state;

public class Program {
    public static void main(String[] args) {
        Room r = new Room();
        State s = new FreeState();
        r.setState(s);

        System.out.println(r.getState());

        r.book();
//        System.out.println(r.getState());

        r.unBook();
//        System.out.println(r.getState());

        r.book();
//        r.checkout();
        r.checkin();
//        System.out.println(r.getState());
//        r.book();
//        r.unBook();
        r.checkout();
//        System.out.println(r.getState());
    }
}
