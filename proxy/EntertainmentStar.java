package proxy;

public class EntertainmentStar implements IDoWithFans {
    private String name;
    public EntertainmentStar(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void live() {
        System.out.println(this.name + " live");
    }

    @Override
    public void doWithFans() {
        System.out.println(this.name + " do with fans");
    }

    @Override
    public void work() {
        System.out.println(this.name + " work");
    }
}
