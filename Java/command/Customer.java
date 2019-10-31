package command;

public class Customer {
    public static void main(String[] args) {
        WaiterInvoker waiterInvoker = new WaiterInvoker();
        Command command1 = new CookBeefCommand();
        Command command2 = new CookChickenCommand();
        waiterInvoker.setCommand(command1);
        waiterInvoker.action();
        waiterInvoker.setCommand(command2);
        waiterInvoker.action();
    }
}
