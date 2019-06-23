package bridge;

public class JImpLog extends ImpLog {
    @Override
    public void Execute(String msg) {
        System.out.println("JAVA platform: " + msg);
    }
}
