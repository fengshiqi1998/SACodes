package state;

public class FreeState extends State {
    @Override
    public String getState() {
        return "当前为空闲状态";
    }

    @Override
    public int book() {
        System.out.println("当前状态空闲，进行预订操作");
        return 0;
    }

    @Override
    public int checkin() {
        System.out.println("当前状态空闲，进行入住操作");
        return 0;
    }

    @Override
    public int unBook() {
        System.out.println("当前状态空闲，无法取消预订操作");
        return 1;
    }

    @Override
    public int checkout() {
        System.out.println("当前状态空闲，无法进行退房操作");
        return 1;
    }
}
