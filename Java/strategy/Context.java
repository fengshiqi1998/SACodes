package strategy;

public class Context {
    private IStrategy _strategy;
    public Context(IStrategy s) {
        this._strategy = s;
    }
    public void fighting() {
        this._strategy.fighting();
    }
}
