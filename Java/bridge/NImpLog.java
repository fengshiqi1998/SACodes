package bridge;

public class NImpLog extends ImpLog {
    @Override
    public void Execute(String msg) {
        System.out.println(".NET platform: " + msg);
    }
}
