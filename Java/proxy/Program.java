package proxy;

public class Program {
    public static void main(String[] args) {
        IDoWithFans p = new Proxy(new EntertainmentStar("MrZhou"));
        p.doWithFans();
        p.work();
    }
}
