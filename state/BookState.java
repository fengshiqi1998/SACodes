package state;

public class BookState extends State {
    @Override
    public String getState() {
        return "当前为已预订状态";
    }

    @Override
    public int book() {
        System.out.println("当前状态为已预订状态，无法进行预定操作");
        return 1;
    }

    @Override
    public int checkin() {
        System.out.println("当前状态为已预订状态，进行入住操作");
        return 0;
    }

    @Override
    public int unBook() {
        System.out.println("当前状态为已预订状态，进行取消预定操作");
        return 0;
    }

    @Override
    public int checkout() {
        System.out.println("当前状态为已预订状态，无法进行退房操作");
        return 1;
    }
}
