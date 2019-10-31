package composite;

public class Doc extends Component {

    public Doc(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        System.out.println("can not add child node for child node");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("has no child node");
    }

    @Override
    public void Display(int depth) {
        System.out.println('-' + depth + name);
    }
}
