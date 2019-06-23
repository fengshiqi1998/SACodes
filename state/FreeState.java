package state;

public class FreeState extends State {
    @Override
    public String getState() {
        return "当前为空闲状态";
    }

    @Override
    public void book() {
        System.out.println("当前状态空闲，进行预订操作");
    }

    @Override
    public void checkin() {
        System.out.println("当前状态空闲，进行入住操作");
    }

    @Override
    public void unBook() {
        System.out.println("当前状态空闲，无法取消预订操作");
    }

    @Override
    public void checkout() {
        System.out.println("当前状态空闲，无法进行退房操作");
    }
}
