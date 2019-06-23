package state;

public class CheckinState extends State {
    @Override
    public String getState() {
        return "当前为入住状态";
    }

    @Override
    public void book() {
        System.out.println("当前状态为入住状态，无法进行预订操作");
    }

    @Override
    public void checkin() {
        System.out.println("当前状态为入住状态，无法进行入住操作");
    }

    @Override
    public void unBook() {
        System.out.println("当前状态为入住状态，无法进行预订操作");
    }

    @Override
    public void checkout() {
        System.out.println("当前状态为入住状态，进行退房操作");
    }
}
