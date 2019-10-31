package command;

public class CookBeefCommand extends Command {
    @Override
    public void execute() {
        kitchener = new BeefKitchener();
        kitchener.cook();
    }
}
