package state;

public class BookState extends State {
    @Override
    public String getState() {
        return "当前为已预订状态";
    }

    @Override
    public void book() {
        System.out.println("当前状态为已预订状态，无法进行预定操作");
    }

    @Override
    public void checkin() {
        System.out.println("当前状态为已预订状态，进行入住操作");
    }

    @Override
    public void unBook() {
        System.out.println("当前状态为已预订状态，进行取消预定操作");
    }

    @Override
    public void checkout() {
        System.out.println("当前状态为已预订状态，无法进行退房操作");
    }
}
