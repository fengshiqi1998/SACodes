package composite;

import java.util.ArrayList;
import java.util.List;

public class Files extends Component {
    List<Component> children = new ArrayList<Component>();
    public Files(String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        this.children.add(c);
    }

    @Override
    public void Remove(Component c) {
        this.children.remove(c);
    }

    @Override
    public void Display(int depth) {
        System.out.println("-" + depth + name);
        for (Component child : children) {
            child.Display(depth + 2);
        }
    }
}
