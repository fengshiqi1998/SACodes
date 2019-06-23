package bridge;

public class DatabaseLog extends Log {
    @Override
    public void Write(String log) {
        implementor.Execute(log);
    }
}
