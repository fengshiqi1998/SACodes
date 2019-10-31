package state;

public class CheckinState extends State {
    @Override
    public String getState() {
        return "当前为入住状态";
    }

    @Override
    public int book() {
        System.out.println("当前状态为入住状态，无法进行预订操作");
        return 1;
    }

    @Override
    public int checkin() {
        System.out.println("当前状态为入住状态，无法进行入住操作");
        return 1;
    }

    @Override
    public int unBook() {
        System.out.println("当前状态为入住状态，无法进行取消预订操作");
        return 1;
    }

    @Override
    public int checkout() {
        System.out.println("当前状态为入住状态，进行退房操作");
        return 0;
    }
}
