package bridge;

public abstract class Log {
    protected ImpLog implementor;

    public void setImplementor(ImpLog implementor) {
        this.implementor = implementor;
    }
    public abstract void Write(String log);
}
