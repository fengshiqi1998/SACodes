package bridge;

public class TextFileLog extends Log {
    @Override
    public void Write(String log) {
        implementor.Execute(log);
    }
}
