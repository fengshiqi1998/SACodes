package proxy;

public class Proxy implements IDoWithFans {
    private IDoWithFans entertainmentStar;
    public Proxy(IDoWithFans entertainmentStar) {
        this.entertainmentStar = entertainmentStar;
    }
    @Override
    public void doWithFans() {
        entertainmentStar.doWithFans();
    }

    @Override
    public void work() {
        entertainmentStar.work();
    }
}
