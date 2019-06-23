package command;

public class CookChickenCommand extends Command {
    @Override
    public void execute() {
        kitchener = new ChickenKitchener();
        kitchener.cook();
    }
}
