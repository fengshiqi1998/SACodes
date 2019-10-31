package facade;

public class Program {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();

        computer.stop();
    }
}
