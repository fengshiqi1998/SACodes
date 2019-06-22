package decorator;

public class Program {
    public static void main(String[] args) {
        A1Car a1Car = new A1Car();
        System.out.println(a1Car.getDescription() + "价格：" + a1Car.getCost());

        A4Car a4Car = new A4Car();
        System.out.println(a4Car.getDescription() + "价格：" + a4Car.getCost());

        Gps gps = new Gps();
        gps.setC(a4Car);
        System.out.println(gps.getDescription() + "价格：" + gps.getCost());

        A6Car a6Car = new A6Car();
        System.out.println(a6Car.getDescription() + "价格：" + a6Car.getCost());

        Radar radar = new Radar();
        radar.setC(a6Car);
        System.out.println(radar.getDescription() + "价格：" + radar.getCost());
    }
}
